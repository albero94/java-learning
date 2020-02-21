package tutorial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.JOptionPane;;

/**
 * Hello world!
 *
 */
public class Basics {
    static Scanner sc = new Scanner(System.in);

    final double SHORTPI = 3.14150;

    public enum Day {
        Monday, Tuesday, Wednesday
    };

    static void dataTypesAndCasting() {
        System.out.println("Hello World!");

        // System.out.println( "Write one word." );
        // String input = sc.next();
        // System.out.println("Your word is: " + input);

        // Data types
        // byte, short, char, boolean, int, float double and long
        final boolean happy = true;
        final char a = 'a';
        final double thousand = 1e+3;
        final long bigNum = 123_456_789;
        System.out.println(thousand + " " + bigNum);

        // Casting
        final int smtInt = 10;
        final long smLong = smtInt;

        final double cDbl = 1.234;
        final int cInt = (int) cDbl;
        System.out.println(cInt);

        final long bigLong = 214758348234L;
        final int bInt = (int) bigLong;
        System.out.println(bInt);

        final String favNum = Double.toString(1.618);
        // Byte.parseByte
        final int strInt = Integer.parseInt("10");

        // Math Functions
        // common + - * / %
        // integer division is integer unless one of them is double
        // ++i i++
        // Math library, abs, ceil, floor, round, max, min, exp, log, log10, pow, sqrt,
        // cbrt, hypot, sin, cos, tan...

        // Random number
        final int minNum = 5;
        final int maxNum = 20;
        final int randNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
        System.out.println(randNum);

        System.out.println("Fav day is " + Day.Monday);

        // HackerRank
        System.out.printf("%-15s %03d%n", "String", 10);

        // Date
        // LocalDate is the new API
        System.out.println(LocalDate.of(2020, 02, 15).getDayOfWeek().toString());

        // Currency
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(1000);
        System.out.println(us);
    }
    }

    static void strings() {
        // Strings
        final String name = "Alvaro";
        String wName = name + " Albero";
        wName += " is my name";
        final String drsDog = "K" + 9;

        System.out.println(wName.charAt(0));
        System.out.println(wName.contains("Albero"));
        System.out.println(wName.indexOf("Albero"));
        wName.length();
        "dog".equals("cat");
        "Dog".equalsIgnoreCase("dog");
        wName.compareTo("ABC"); // 0 equal, -1 string comes before, 3 string comes after
        System.out.println(wName.replace("Albero", "Gran"));
        wName.substring(0, 5);

        for (final String x : wName.split(" "))
            System.out.println(x);

        // trim toUpperCase toLowerCase

        // String builders and buffers
        final StringBuilder sb = new StringBuilder("I'm a string builder");
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
        final int[] a1 = new int[10];
        a1[0] = 1;
        Arrays.fill(a1, 2);
        System.out.println(a1[5]);
        System.out.println(a1.length);

        final String[] a2 = { "one", "two" };
        final int[] oneTo10 = IntStream.rangeClosed(1, 10).toArray();

        for (final int x : oneTo10)
            System.out.print(x);
        System.out.println();
        Arrays.binarySearch(oneTo10, 9);

        final int a3[][] = new int[2][2];
        final String[][] a4 = { { "00", "10" }, { "01", "11" } };
        System.out.println(a4[1][1]);

        final int a6[] = { 1, 2, 3 };
        final int a7[] = Arrays.copyOf(a6, 3);
        System.out.println(a6.equals(a7));
        final int a8[] = { 3, 2, 1 };
        Arrays.sort(a8);
        System.out.println(Arrays.toString(a8));

        // ArrayList, resizes
        final ArrayList<String> aL1 = new ArrayList<String>(20);
        aL1.add("Sue");
        final ArrayList<Integer> aL2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        for (final Integer x : aL2)
            System.out.print(x);
        System.out.println();
        aL2.get(1); // Index
        aL2.set(1, 5);
        aL2.remove(3);
        // al2.clear(); delete every element

        final Iterator<Integer> it = aL2.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // LinkedList
        final LinkedList<Integer> iL1 = new LinkedList<Integer>();
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
            final String userName = sc.nextLine();
            System.out.println("Hello " + userName);
        }

        final String jopName = JOptionPane.showInputDialog("Enter name");
        System.out.println("Hello " + jopName);
    }

    public static void conditionalsAndLoops() {
        // Conditionals
        // Relational operators: == != > < >= <=
        // Logical operators: ! && ||
        final int age = 12;
        if ((age >= 5) && age <= 6)
            System.out.println("Go to Kindergarten");
        else if (age >= 7 && age <= 13)
            System.out.println("Go to Middle School");
        else if (age >= 14 && age <= 18)
            System.out.println("Go to High School");
        else
            System.out.println("Stay Home");

        final boolean canVote = (age >= 18) ? true : false;
        System.out.println("Can vote: " + canVote);

        final String lang = "France";
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

        final int secretNum = 8;
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

    public static int getSum(final int x, final int y) {
        return x + y;
    }

    public static int getSum2(final int... nums) {
        int sum = 0;
        for (final int x : nums) {
            sum += x;
        }
        return sum;
    }

    public static int[] getNext2(final int x) {
        final int[] vals = new int[2];
        vals[0] = x + 1;
        vals[1] = x + 2;
        return vals;
    }

    static List<Object> getRandList() {
        final String name = "Jose";
        final int age = 55;
        return Arrays.asList(name, age);
    }

    static int factorial(final int num) {
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

        final int[] multVA = getNext2(5);
        for (final int x : multVA)
            System.out.println(x);

        final List<Object> randList = getRandList();
        System.out.println(randList);

        System.out.println("Fact 7 = " + factorial(7));
    }

    public static void exceptionHandling() {
        try {
            final int badInt = 10 / 0;
        } catch (final ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (final Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Clean up");
        }
    }

    public static void streams() {
        final List<Integer> oneTo10 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        // stream from 1 to 10
        // boxed returns a list that is boxed to an integer
        // collect process the list elements into a container that is a list container

        final List<Integer> squares = oneTo10.stream().map(x -> x * x).collect(Collectors.toList());
        for (final Integer x : squares)
            System.out.print(x + " ");
        System.out.println();

        final List<Integer> evens = oneTo10.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        for (final Integer x : evens)
            System.out.print(x + " ");
        System.out.println();

        final IntStream limitTo5 = IntStream.range(1, 10).limit(5);
        limitTo5.forEach(System.out::print);
        System.out.println();

        final int multAll = IntStream.range(1, 5).reduce(1, (x, y) -> x * y);
        System.out.println(multAll);

        final DoubleStream stream = IntStream.range(1, 5).mapToDouble(i -> i);

        final IntSummaryStatistics iStats = IntStream.range(1, 10).summaryStatistics();
        System.out.println(iStats.getAverage());
        System.out.println(iStats.getSum());
        System.out.println(iStats.getMax());
        System.out.println(iStats.getMin());
    }

    public static void lambdaExpressions() {
        final ArrayList<Integer> oneTo5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        oneTo5.forEach(x -> System.out.println(x * 2));
        oneTo5.forEach(x -> {
            if (x % 2 == 0)
                System.out.println(x);
        });

        List<Integer> fib = new LinkedList<Integer>();

        fib = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(10).map(n -> n[0])
                .collect(Collectors.toList());
        fib.forEach(x -> System.out.println(x));
    }

    public static void fileFunctions() {
        final File f1 = new File("f1.log");

        try {
            if (f1.createNewFile()) {
                System.out.println("File created");
                f1.renameTo(new File("f1BU.log"));
            } else {
                System.out.println("File not created");
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }

        final File d1 = new File("\\");

        if (d1.isDirectory()) {
            final File[] files = d1.listFiles();
            for (final File x : files)
                System.out.println(x.getName());
        }

        File f2 = new File("f2.txt");

        try {
            final PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f2)));
            pw.println("This is sample text");
            pw.close();
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        f2 = new File("f2.txt");
        try {
            final BufferedReader bR = new BufferedReader(new FileReader(f2));
            String text = bR.readLine();
            while (text != null) {
                System.out.println(text);
                text = bR.readLine();
            }
            bR.close();
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        File f3 = new File("f3.dat");
        FileOutputStream fOS;

        try {
            fOS = new FileOutputStream(f3); // (f3, true) appends instead of overwriting
            final BufferedOutputStream bOS = new BufferedOutputStream(fOS);
            final DataOutputStream dOS = new DataOutputStream(bOS);

            final String name = "Alvaro";
            final int age = 25;
            final double bal = 1234.56;

            dOS.writeUTF(name);
            dOS.writeInt(age);
            dOS.writeDouble(bal);
            dOS.close();
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

        f3 = new File("f3.dat");
        try {
            final DataInputStream dIS = new DataInputStream(new BufferedInputStream(new FileInputStream(f3)));

            System.out.println(dIS.readUTF());
            System.out.println(dIS.readInt());
            System.out.println(dIS.readDouble());
            dIS.close();
        } catch (final IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void generics() {
        final String[] gA1 = { "one", "two" };
        final Integer[] gA2 = { 1, 2, 3, 4 };
        printStuff(gA1);
        printStuff(gA2);
        final ArrayList<Integer> aL1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        printAL(aL1);

        final MyGeneric<Integer> myGI = new MyGeneric<Integer>();
        myGI.setVal(10);
        System.out.println(myGI.getVal());

        final MyGeneric<String> myGS = new MyGeneric<String>();
        myGS.setVal("Dog");
        System.out.println(myGS.getVal());
    }

    public static <E> void printStuff(final E[] arr) {
        for (final E x : arr)
            System.out.println(x);
    }

    public static void printAL(final ArrayList<?> aL) {
        for (final Object x : aL)
            System.out.println(x);
    }

    public static void threads() {
        final Thread t1 = new Thread(new MyThread(), "Thread 1");
        final Thread t2 = new Thread(new MyThread(), "Thread 2");
        final Thread t3 = new Thread(new MyThread(), "Thread 3");

        t1.start();
        t2.start();
        System.out.println("Main thread keeps running!");

        try {
            t1.join();
        } catch (final InterruptedException ex) {
            ex.printStackTrace();
        }
        t3.start();

    }

    public static void threads2() {
        ThreadTest tT1 = new ThreadTest(new Customer("Sam"));
        tT1.start();
        ThreadTest tT2 = new ThreadTest(new Customer("Sue"));
        tT2.start();
        ThreadTest tT3 = new ThreadTest(new Customer("Sid"));
        tT3.start();
    }

    public static void main(final String[] args) {
        threads2();
    }

}

class MyGeneric<T> {
    T val;

    public void setVal(final T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Start thread: " + Thread.currentThread().getName());
        System.out.println("Active threads: " + Thread.activeCount());

        try {
            Thread.sleep(3000);
        } catch (final InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("End thread : " + Thread.currentThread().getName());
    }

}

class Customer {
    public String name;

    public Customer(final String name) {
        this.name = name;
    }
}

class BankAccount {
    static BankAccount account;
    static int balance = 100;
    static Customer customer;

    public static BankAccount getAccount(final Customer customer) {
        if (account == null) {
            account = new BankAccount();
            return account;
        }
        BankAccount.customer = customer;
        return account;
    }

    public static int getBalance() {
        return balance;
    }

    public synchronized void withdraw(final int bal) {
        try {
            if (balance >= bal) {
                System.out.println(customer.name + " requested $" + bal);
                Thread.sleep(1000);
                balance -= bal;
                System.out.println(customer.name + " received $" + bal);
            } else {
                System.out.println(customer.name + " try to exceed balance.");
            }
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(customer.name + " current balance is $" + balance);
        System.out.println();
    }
}

class ThreadTest extends Thread implements Runnable{
    Customer customer;
    public ThreadTest(Customer customer){
        this.customer = customer;
    }

    public void run(){
        for(int i = 0; i< 4; i++){
            try{
                BankAccount account = BankAccount.getAccount(customer);
                account.withdraw(10);
                Thread.sleep(1000);
            } catch (final Exception ex) {
            ex.printStackTrace();
        }
        }
    }
}