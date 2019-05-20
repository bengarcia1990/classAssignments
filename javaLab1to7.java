public class javaLab1to7 {
    public static void main(String[] args){
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt = 0;
        float fval = 4.4f;
        boolean isCold = false;
        double dubInt = 100_000_000;
        int newVal = firstInt + secondInt;
        int newerVal = firstInt + thirdInt;
        int newestVal = secondInt/firstInt;
        int remain = secondInt%firstInt;
        int modAdd = remain + firstInt;
        int x = 100;
        boolean val = (x==100);
        int y = 106;
        int z = 92;
        int n = 64;
        int o = n>>1;
        int p = n<<1;
        int nTwo = 40;
        int q = nTwo>>1;
        int r = nTwo<<1;
        int t = nTwo<<2;
        int nThree = 39;
        int u = nThree<<1;
        int v = nThree>>1;

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(fval);
        System.out.println(dubInt);
        System.out.println(newVal);
        System.out.println(newerVal);
        System.out.println(newestVal);
        System.out.println(remain);
        System.out.println(++modAdd);
        System.out.println(x>y);
        System.out.println(y>x);
        System.out.println(x>=y-6);
        System.out.println(x<y&&y<z);
        System.out.println(y<z&&x>=y);
        System.out.println(z>y+x||x-y<z);
        System.out.println(x<y!=x>y);
          System.out.println(o == n/2);
          System.out.println(p == n*2);
          System.out.println(q == nTwo/2);
          System.out.println(r == nTwo*2);
          System.out.println(t == nTwo*4);
          System.out.println(u);
          System.out.println(v);
        anotherMethod();
        playWithStrings();
    }

    public static void anotherMethod()
    {
        Integer a = 100;
        Integer b = Integer.valueOf("1000");
        Integer c = Integer.compare(a,b);
        Integer deuxieme = a/2;

        if(c>=0){

            System.out.println(a+" "+"is a big value");
            System.out.println(deuxieme+" "+"is half a big value");
        }
        else{
            System.out.println(a+" "+"is not a big value.");
            System.out.println(deuxieme+" "+"is definitely small.");
        }
    }

    public static void playWithStrings(){
        String s1 = "ben";
        String s2 = new String("garcia");
        String greeting = s1.concat(" ").concat(s2);
        int strL = greeting.length();
        int indOf = greeting.indexOf("a");
        char findChar = greeting.charAt(7);
        boolean contStr = greeting.contains("son");
        String lastFive = greeting.substring(5,10);
        boolean matching = (greeting.matches("'") || greeting.matches("-"));



        String str = String.format("The total length of the string greeting is %d", strL);
        String str2 = String.format("The index of the first o in the string greeting is %d", indOf);
        String str3 = String.format("The character at index 7 is %c", findChar);
        String str4 = String.format("Does the string contain son? %b", contStr);
        String str5 = String.format("The last five characters of the string are %s", lastFive);
        String str6 = String.format("Does the string contain an apostraphe or dashes? %b", matching);

        System.out.println("Hello"+" "+greeting);
        System.out.println("Hello"+" "+s1+" "+s2);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }

}
