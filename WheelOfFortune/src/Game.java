import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    Player one = new Player();
    Player two = new Player();
    Player three = new Player();
    ArrayList<Player> players = new ArrayList<>();
    Wheel wheel = new Wheel();


    public Game(){

    }

    public void sayHello(){
        one.setName();
        two.setName();
        three.setName();
    }

    public void initialOrder() {
        ArrayList<Integer> roundOrder = new ArrayList<>(
                Arrays.asList(1, 2, 3));
            Random rdm = new Random();
            int indexOne = roundOrder.get(rdm.nextInt(roundOrder.size()));
            roundOrder.remove(roundOrder.indexOf(indexOne));
            one.setOrder(indexOne);
            int indexTwo = roundOrder.get(rdm.nextInt(roundOrder.size()));
            two.setOrder(indexTwo);
            roundOrder.remove(roundOrder.indexOf(indexTwo));
            int indexThree = roundOrder.get(0);
            three.setOrder(indexThree);
    }

    public void round(){
        wheel.setPuzzles("PuzzleList");
        wheel.setWheelConfig("WheelConfig");
        String currentAnswer;

        boolean puzzleSolved = false;

        do {
            ArrayList<Character> consBank = Util.creatConsBank();
            ArrayList<Character> vowelBank = new ArrayList<>();
            vowelBank.add('A');
            vowelBank.add('E');
            vowelBank.add('I');
            vowelBank.add('O');
            vowelBank.add('U');
            wheel.setCurrentPuzzle();
            currentAnswer = wheel.getPuzzleAnswer();
            StringBuilder hiddenPuzz = wordHider(currentAnswer);

            for(Player p : players){
                p.setTempCash(0);
            }

            //for loop for amount of money each player has
            for(Player p : players) {
                System.out.println(p.getName() + ": $" + p.getGrandCash() + "   ");
            }

            for (Player p : players) {
                boolean playerContinue = true;
                while (playerContinue && !puzzleSolved) {
                    System.out.println("It is " + p.getName() + "'s turn.");
                    System.out.println(hiddenPuzz);
                    System.out.println(p.getName() + " GrandTotal: $" + p.getGrandCash() + "    TempCash: $" + p.getTempCash());
                    p.setTurnCash(0);

                    System.out.println(hiddenPuzz);
                    if (p.getTempCash() > 250) {
                        System.out.println("Press 3 to buy a vowel.");
                    }

                    System.out.println("Press 0 to quit, 1 to spin the wheel, or 2 to solve the puzzle.");
                    int userResponse;

                    try {
                        userResponse = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid entry!");
                        scanner.nextLine();
                        break;
                    }


                    //if user hits 0, exits the program
                    if (userResponse > 3) {
                        System.out.println("Invalid entry!");
                        break;
                    } else if (userResponse == 0) {
                        System.exit(0);
                    } else if (userResponse == 2) {
                        scanner.nextLine();
                        System.out.println("Enter your solution: ");
                        String userSolution = scanner.nextLine().toUpperCase();

                        if (userSolution.equals(currentAnswer)) {
                            System.out.println("Correct!");
                            System.out.println(p.getName() + " solved the puzzle!");
                            p.addSolvedCash();
                            p.addWin();
                            puzzleSolved = true;
                            break;
                        }
                    } else if (userResponse == 1) {
                        int wheelResult = wheel.spinWheel();
                        if (wheelResult == -1) {
                            System.out.println("Wheel landed on a Lose-A-Turn!");
                            break;
                        } else if (wheelResult == 0) {
                            System.out.println("Wheel landed on Bankrupt!");
                            p.setBankrupt();
                            break;
                        } else {
                            p.setTurnCash(wheelResult);
                            scanner.nextLine();
                            System.out.println("Wheel landed on $" + wheelResult);

                            boolean isConsonant = false;
                            char userCons;
                            do {
                                System.out.println("Available letters: " + consBank);
                                System.out.println("Select a letter: ");
                                userCons = scanner.nextLine().toUpperCase().charAt(0);


                                if (!"AEIOU".contains(String.valueOf(userCons))) {
                                    isConsonant = true;
                                }
                                if (consBank.indexOf(userCons) == -1) {
                                    System.out.println("Letter unavailable, pay attention!");
                                    isConsonant = false;
                                }
                            } while (!isConsonant);

                            consBank.remove(consBank.indexOf(userCons)); //removing letters from bank that have been used


                            //checks letters in answer if correct
                            int letterCount = 0;
                            for (int i = 0; i < currentAnswer.length(); i++) {
                                if (userCons == currentAnswer.charAt(i)) {
                                    hiddenPuzz.setCharAt(i, userCons);
                                    letterCount++;
                                }
                            }
                            if (letterCount == 0) {
                                System.out.println("There aren't any " + userCons + "s in the answer.");
                                playerContinue = false;
                                break;
                            } else {
                                System.out.println("There are " + letterCount + " " + userCons + "s in the answer.");
                                p.addTempCash(p.getTurnCash(), letterCount);
                                playerContinue = true;
                            }
                        }
                        //if player wants to select a vowel
                    } else if (userResponse == 3) {
                        if (p.getTempCash() < 250) {
                            System.out.println("You don't have enough money to buy a vowel!");
                            break;
                        }
                        boolean isVowel = false;
                        char userVowel;
                        do {
                            scanner.nextLine();
                            System.out.println("Available vowels: " + vowelBank);
                            System.out.println("Select a vowel: ");
                            userVowel = scanner.nextLine().toUpperCase().charAt(0);
                            if ("AEIOU".contains(String.valueOf(userVowel))) {
                                isVowel = true;
                            }
                            if (vowelBank.indexOf(userVowel) == -1) {
                                System.out.println("That vowel has already been guessed, pay attention!");
                                isVowel = false;
                            }
                        } while (!isVowel);

                        vowelBank.remove(vowelBank.indexOf((userVowel)));

                        p.addTempCash(-250, 1);


                        //checks letters in answer if correct
                        int letterCount = 0;
                        for (int i = 0; i < currentAnswer.length(); i++) {
                            if (userVowel == currentAnswer.charAt(i)) {
                                hiddenPuzz.setCharAt(i, userVowel);
                                letterCount++;
                            }
                        }
                        if (letterCount == 0) {
                            System.out.println("There aren't any " + userVowel + "s in the answer.");
                            playerContinue = false;
                            break;
                        } else {
                            System.out.println("There are " + letterCount + " " + userVowel + "s in the answer.");
                            System.out.println(hiddenPuzz);
                            playerContinue = true;
                        }
                    }
                }
                System.out.println("Moving to next player");
            }
        }while(!puzzleSolved);

    }

    public StringBuilder wordHider(String str){
        StringBuilder charArray = new StringBuilder();
        for (char s: str.toCharArray()) {
            if (s != ' '){
                charArray.append('*');
            }
            else charArray.append(s);

        }
        return charArray;
    }

}
