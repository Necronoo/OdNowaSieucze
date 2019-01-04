package com.timbuchalka;

import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            String Nazwa = scanner.nextLine();
            String sprawdzmy = "/Users/michalpodejko/Desktop/" + Nazwa + ".txt";
            //File file =new File("/Users/michalpodejko/Desktop/Marta Podejko.txt");
            File file =new File(sprawdzmy);
            String Tekst = scanner.nextLine();
            if(!file.exists()){
                file.createNewFile();
            }
        FileWriter fw = new FileWriter(file,true);
BufferedWriter bf = new BufferedWriter(fw);
bf.write(Tekst);
bf.close();
            System.out.println("Data successfully appended at the end of file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }

    }

}
