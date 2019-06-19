import java.util.Scanner;

public class Player {
    String name;
    Integer order;
    Integer grandTotal = 0;
    Integer tempTotal = 0;
    boolean turn = false;
    private int tempCash;
    private int grandCash;
    private int turnCash;
    private int wins;

public Player(){
    grandCash = tempCash = turnCash = 0;
}
Scanner scanner = new Scanner(System.in);

    public void addWin(){wins++;}

    public void setName() {
    System.out.println("Please enter a name for player:");
    name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void addTempCash(int cash, int multi) {tempCash += (cash * multi);}
    public void setTempCash(int cash) {this.tempCash = cash;}
    public int getTempCash(){ return tempCash;}

    public void setTurnCash(int cash){this.turnCash = cash;}
    public int getTurnCash(){return turnCash;}

    public void addSolvedCash() {grandCash = (turnCash + tempCash);}
    public void addGrandCash(int multi) {grandCash += (tempCash * multi);}
    public int getGrandCash() {return grandCash;}

    public int getTotalCash() {return tempCash + grandCash;}
    public void setBankrupt() {tempCash = 0;}
}
