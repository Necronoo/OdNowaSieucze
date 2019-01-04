package com.timbuchalka;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("tescik dupeczki :>");
        System.out.println("a teraz");
        String Mamamija = "Hello";
        String Tescik = "";
        //3.6.5
        if (!Mamamija.equals("")) {
            System.out.println("Chuja!");
        } else {
            System.out.println("nie robie nic");
        }

        if (Tescik.length() == 0) {
            System.out.println("Chuja! x2 ");
        } else {
            System.out.println("nie robie nic ");
        }
        char last = Mamamija.charAt(4);
        System.out.println(last);

//3.7.1
//        Scanner scanner = new Scanner(System.in);
//        String  name = scanner.next(); // bez spacji kutasie ;D
//        scanner.next();
//        System.out.println( name);


        System.out.printf("%tc", new Date()); // akutalna Data ;>
        System.out.println();
        File file = new File("/Users/michalpodejko/Desktop/new.txt");
        try {
            PrintWriter out = new PrintWriter(file);
        out.println("magiczna pulapka "+ " siusiak " + last);
        out.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        try {
            // Create a new Scanner object which will read the data
            // from the file passed in. To check if there are more
            // line to read from it we check by calling the
            // scanner.hasNextLine() method. We then read line one
            // by one till all lines is read.
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
