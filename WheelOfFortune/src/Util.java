import java.util.ArrayList;

public class Util {

    public static ArrayList<Character> creatConsBank(){
        ArrayList<Character> consBank = new ArrayList<>();
        for(int i = 65; i<91;i++) {
            char newChar = (char) i;
            if(!"AEIOU".contains(String.valueOf(newChar))){
                consBank.add(newChar);
            }
        }
        return consBank;
    }
}
