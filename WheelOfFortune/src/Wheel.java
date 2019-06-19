import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Wheel {
    private ArrayList<String> puzzles;
    private ArrayList<Integer> wheelConfigs;
    private String[] currentPuzzle;

    public Wheel() {
        puzzles = new ArrayList<>();
        wheelConfigs = new ArrayList<>();
    } //constructor for a wheel object

    public void setPuzzles(String fileName) {
        ArrayList<String> arrList = new ArrayList<>();
        Path path = Paths.get(fileName);
        try(Stream<String> lines = Files.lines(path)){
            Object[] arr = lines.toArray();
            for(Object t : arr) {
                arrList.add(t.toString());
            } // this method is a reusable setter to take any txt file puzzlebank and use it for the game
        }
        catch(Exception e) {
            System.out.println("Didn't work 1");
        }
        puzzles = arrList;
    }

//    public int getPuzzleNum() { return puzzles.size() - 1; } //end getPuzzleNum

    public void setWheelConfig(String fileName) {
        wheelConfigs.clear();
        ArrayList<String> arrList = new ArrayList<>();
        Path path = Paths.get(fileName);
        try(Stream<String> lines = Files.lines(path)){
            Object[] arr = lines.toArray();
            for(Object t : arr) {
                arrList.add(t.toString());
            } // this method is a reusable setter to take any txt file with wheel values and use it for the game
        }
        catch(Exception e) {
            System.out.println("WC didn't work");
        }
        for(String s : arrList){
            wheelConfigs.add(Integer.parseInt(s));
        }
    }

    public int spinWheel() {
        Random rand = new Random();
        int wheelIndex = rand.nextInt(wheelConfigs.size() - 1) + 1;
        return wheelConfigs.get(wheelIndex);
    } //this method returns a value from the arraylist of wheel values set in the setWheelConfig method

    public boolean setCurrentPuzzle() { //selects random puzzle
        if(puzzles.isEmpty()) {
            System.out.println("1");
           return false;
        }
        Random rand = new Random();
        int newPIndex = rand.nextInt(puzzles.size()-1)+1;
        currentPuzzle = puzzles.get(newPIndex).split(":");
        puzzles.remove(newPIndex);
        return true;
    }

    public String getPuzzleHint(){return currentPuzzle[0];}
    public String getPuzzleAnswer() { return currentPuzzle[0]; }

    public StringBuilder createOutput(String currentAnswer) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < currentAnswer.length(); i++) {
            if(currentAnswer.charAt(i) == ' '){
                output.append("  ");
            } else {
                output.append(" _");
            } //end else
        }
        return output;
    }

    public boolean solveAttempt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Solution: ");
        String userSolution = scanner.nextLine();
        return userSolution.toUpperCase().equals(getPuzzleAnswer());
    } //end solveAttempt
}
