package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println("tescik dupeczki :>");
        System.out.println("a teraz");
        String Mamamija = "Hello";
        String Tescik = "";
        //3.6.5
        if (!Mamamija.equals("")) {
            System.out.println("Chuja!");
        }
        else {
            System.out.println( "nie robie nic");
        }

        if (Tescik.length() == 0) {
            System.out.println("Chuja! x2 " );
        }
        else {
            System.out.println( "nie robie nic ");
        }
        char last = Mamamija.charAt(4);
        System.out.println( last);


    }
}
