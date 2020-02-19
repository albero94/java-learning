package tutorial;

import java.util.*;

import java.util.stream.IntStream;

import javax.swing.JOptionPane;;

/**
 * Hello world!
 *
 */
public class App {
    static Scanner sc = new Scanner(System.in);

    final double SHORTPI = 3.14150;
    public enum Day{Monday, Tuesday, Wednesday};

    static void dataTypesAndCasting() {
        System.out.println("Hello World!");

        // System.out.println( "Write one word." );
        // String input = sc.next();
        // System.out.println("Your word is: " + input);

        // Data types
        // byte, short, char, boolean, int, float double and long
        boolean happy = true;
        char a = 'a';
        double thousand = 1e+3;
        long bigNum = 123_456_789;
        System.out.println(thousand + " " + bigNum);

        // Casting
        int smtInt = 10;
        long smLong = smtInt;

        double cDbl = 1.234;
        int cInt = (int) cDbl;
        System.out.println(cInt);

        long bigLong = 214758348234L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.618);
        // Byte.parseByte
        int strInt = Integer.parseInt("10");

        // Math Functions
        // common + - * / %
        // integer division is integer unless one of them is double
        // ++i i++
        // Math library, abs, ceil, floor, round, max, min, exp, log, log10, pow, sqrt,
        // cbrt, hypot, sin, cos, tan...

        // Random number
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        System.out.println(randNum);

        System.out.println("Fav day is " + Day.Monday);
    }

    static void strings() {
        // Strings
        String name = "Alvaro";
        String wName = name + " Albero";
        wName += " is my name";
        String drsDog = "K" + 9;

        System.out.println(wName.charAt(0));
        System.out.println(wName.contains("Albero"));
        System.out.println(wName.indexOf("Albero"));
        wName.length();
        "dog".equals("cat");
        "Dog".equalsIgnoreCase("dog");
        wName.compareTo("ABC"); // 0 equal, -1 string comes before, 3 string comes after
        System.out.println(wName.replace("Albero", "Gran"));
        wName.substring(0, 5);

        for (String x : wName.split(" "))
            System.out.println(x);

        // trim toUpperCase toLowerCase

        // String builders and buffers
        StringBuilder sb = new StringBuilder("I'm a string builder");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Yeah");
        sb.insert(6, "Big ");
        sb.replace(6, 9, "wig");
        sb.substring(6, 10);
        sb.delete(6, 10);
        sb.indexOf("Yeah");
        System.out.println(sb);
        // buffers are nearly the same, but used with threads
    }

    public static void arraysAndLists() {
        // Arrays
        int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1, 2);
        System.out.println(a1[5]);
        System.out.println(a1.length);

        String[] a2 = { "one", "two" };
        int[] oneTo10 = IntStream.rangeClosed(1, 10).toArray();

        for (int x : oneTo10)
            System.out.print(x);
        System.out.println();
        Arrays.binarySearch(oneTo10, 9);

        int a3[][] = new int[2][2];
        String[][] a4 = { { "00", "10" }, { "01", "11" } };
        System.out.println(a4[1][1]);

        int a6[] = { 1, 2, 3 };
        int a7[] = Arrays.copyOf(a6, 3);
        System.out.println(a6.equals(a7));
        int a8[] = { 3, 2, 1 };
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));

        // ArrayList, resizes
        ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");
        ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (Integer x : aL2)
            System.out.print(x);
        System.out.println();
        aL2.get(1); // Index
        aL2.set(1, 5);
        aL2.remove(3);
        // al2.clear(); delete every element

        Iterator<Integer> it = aL2.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // LinkedList
        LinkedList<Integer> iL1 = new LinkedList<Integer>();
        iL1.add(1);
        iL1.add(2);
        iL1.add(3);
        iL1.addAll(Arrays.asList(1, 2, 3, 4));
        iL1.addFirst(0);
        iL1.contains(4);
        iL1.indexOf(4);
        iL1.set(0, 2);
        iL1.get(0);
        iL1.remove(1);
        iL1.size();
        System.out.println(iL1);
    }

    public static void userInput() {
        // User input
        System.out.print("Enter name: ");
        if (sc.hasNextLine()) { // hasShort, Int...
            String userName = sc.nextLine();
            System.out.println("Hello " + userName);
        }

        String jopName = JOptionPane.showInputDialog("Enter name");
        System.out.println("Hello " + jopName);
    }

    public static void conditionalsAndLoops() {
        // Conditionals
        // Relational operators: == != > < >= <=
        // Logical operators: ! && ||
        int age = 12;
        if ((age >= 5) && age <= 6)
            System.out.println("Go to Kindergarten");
        else if (age >= 7 && age <= 13)
            System.out.println("Go to Middle School");
        else if (age >= 14 && age <= 18)
            System.out.println("Go to High School");
        else
            System.out.println("Stay Home");

        boolean canVote = (age >= 18) ? true : false;
        System.out.println("Can vote: " + canVote);

        String lang = "France";
        switch (lang) {
            case "Chile":
            case "Cuba":
                System.out.println("Hola");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Hello");
        }

        // Looping
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println();

        int wl = 0;
        while (wl < 20) {
            if (wl % 2 == 0)
                System.out.print(wl + " ");
            wl++;
        }
        System.out.println();

        int secretNum = 8;
        int guess = 0;
        do {
            System.out.print("Guess: ");
            if (sc.hasNextInt()) {
                guess = sc.nextInt();
            }
            // System.out.println();
        } while (guess != secretNum);
        System.out.println("You guessed right!");
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static int getSum2(int... nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }

    public static int[] getNext2(int x) {
        int[] vals = new int[2];
        vals[0] = x + 1;
        vals[1] = x + 2;
        return vals;
    }

    static List<Object> getRandList() {
        String name = "Jose";
        int age = 55;
        return Arrays.asList(name, age);
    }

    static int factorial(int num) {
        if (num == 1)
            return 1;
        else {
            return num * factorial(num - 1);
        }
    }

    public static void methods() {
        // Methods
        System.out.println("5 + 4 = " + getSum(5, 4));
        // paramameters are passed by value and not affected outside of the function
        System.out.println("Sum: " + getSum2(2, 3, 4, 5));

        int[] multVA = getNext2(5);
        for (int x : multVA)
            System.out.println(x);

        List<Object> randList = getRandList();
        System.out.println(randList);

        System.out.println("Fact 7 = " + factorial(7));
    }

    public static void exceptionHandling(){
        try {
            int badInt = 10/0;
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Clean up");
        }
    }

    public static void main(String[] args) {
        exceptionHandling();
    }

}
