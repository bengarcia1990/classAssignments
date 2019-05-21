import java.util.Scanner;

public class controlFlowLab {
    public static void main(String args[])
    {
//        // scanner reads input from the command line through various methods
//        Scanner scanner = new Scanner(System.in);
//
//        // prompt and read a string
//        System.out.print("Enter your name: ");
//        String username = scanner.next();
//
//        // prompt and read an int
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        //prompt and read first char of employment status
//        System.out.println("Employment status? Employed, Unemployed or Student");
//        char employment = scanner.next().charAt(0);
//
//        //prompt and read first char of vehicle status
//        System.out.println("Do you own a vehicle? Car? Truck? SUV? Other? None?");
//        char vehicle = scanner.next().charAt(0);
//
//        String sixteenPriv = "drive";
//        String eighteenPriv = "vote";
//        String twentyOnePriv = "drink";
//        String thirtyFivePriv = "be president";
//        String fiftyFivePriv = "join AARP";
//        String sixtySevenPriv = "retire";
//
//
//        if(age>=16){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s", username, age,                sixteenPriv));
//        }
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s, %s, %s, %s, %s            or %s", username, age, sixteenPriv, eighteenPriv, twentyOnePriv, thirtyFivePriv, fiftyFivePriv, sixtySevenPriv));
//        }
//
//        if(age>=18){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s and %s", username,              age,sixteenPriv, eighteenPriv));
//        }
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s, %s, %s, %s                 or %s", username, age, eighteenPriv, twentyOnePriv, thirtyFivePriv, fiftyFivePriv, sixtySevenPriv));
//        }
//
//        if(age>=21){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s and %s and %s",                  username,age,sixteenPriv, eighteenPriv, twentyOnePriv));
//        }
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s, %s, %s                     or %s", username, age, twentyOnePriv, thirtyFivePriv, fiftyFivePriv, sixtySevenPriv));
//        }
//
//        if(age>=35){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s and %s and %s and %s",username,age,sixteenPriv, eighteenPriv, twentyOnePriv, thirtyFivePriv));
//        }
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s, %s or %s", username, age, thirtyFivePriv, fiftyFivePriv, sixtySevenPriv));
//        }
//
//        if(age>=55){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s and %s and %s and                %s and %s",username,age,sixteenPriv, eighteenPriv, twentyOnePriv, thirtyFivePriv, fiftyFivePriv));
//        }
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s or %s",
//                    username, age, fiftyFivePriv, sixtySevenPriv));
//        }
//
//        if(age>=67){
//            System.out.println(String.format("Hello %s, your age is %d and you are old enough to %s and %s and %s and                %s and %s",username,age,sixteenPriv, eighteenPriv, twentyOnePriv, thirtyFivePriv, sixtySevenPriv));
//        }
//
//        else{
//            System.out.println(String.format("Hello %s, your age is %d and you are not old enough to %s",
//                    username, age, sixtySevenPriv));
//        }
//
//        String empmsg = " ";
//        switch(employment)
//        {
//            case 'E':
//            case 'e':
//                empmsg = "You are employed";
//                break;
//            case 'U':
//            case 'u':
//                empmsg = "You are unemployed";
//                break;
//            case 'S':
//            case 's':
//                empmsg = "You are a student";
//                break;
//        }
//        System.out.println(empmsg);
//
//        String vehmsg = " ";
//        switch(vehicle)
//        {
//            case 'C':
//            case 'c':
//                vehmsg = "You have a car";
//                break;
//
//            case 'T':
//            case 't':
//                vehmsg = "You have a truck";
//                break;
//
//            case 'S':
//            case 's':
//                vehmsg = "You have an SUV";
//                break;
//
//            case 'O':
//            case 'o':
//                vehmsg = "You have a something else?";
//                break;
//
//            case 'N':
//            case 'n':
//                vehmsg = "You have no vehicle";
//                break;
//        }
//        System.out.println(vehmsg);


        int[] myArray = new int[30];
//        int[] revArray = new int[myArray.length];

//        for(int i = 0; i<myArray.length; i++){
//            myArray[i]=i;
//        }
//        for( int item: myArray){
//            System.out.println(item);
//        }
//        for(int i = 0; i<myArray.length; i++){
//            myArray[i] = i*2;
//        }
//
//        for(int i = 0; i<myArray.length; i++){
//            int x = myArray.length-1 - i;
//            revArray[i] = myArray[x];
//        }

//        for( int item: revArray){
//            System.out.println(item);
//        }

//        int i = 0;
//        while(i<myArray.length)
//        {
//            myArray[i]=i;
//            System.out.println(i);
//            i++;
//        }
//        while(i<myArray.length){
//            int x = myArray.length-1 - i;
//            revArray[i] = myArray[x];
//            System.out.println(x);
//            i++;
//        }


stepFive(22);

    }

    public static int stepFive(int a) {
//        ----------------- Step 5 Part 1-------------------------
//        int[] myArray = new int[30];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = i;
//            System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
//        }
//        for (int item : myArray) {
//            if (item == a) break;
//
//            if (item % 2 != 0) {
//                continue;
//            } else if (item % 2 == 0) {
//                System.out.println(item);
//            }
//        }

        //-----------------Step 5 Part 2-------------------------
        int[] myArray = new int[30];
        int sum=0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
        }
        for (int item : myArray) {
            if (item == a) {
                //System.out.println("The total sum of even numbers is "+sum);
                break;
            }
            if (item%2!=0) {
                System.out.println(item);
            }
            else if(item%2 ==0) {
                //System.out.println(sum += item);
                //System.out.println(String.format("The previous sum %d plus the current value %d equals %d", sum, item, sum+item));
                sum+=item;
            }
        } return sum;
    }
    }
