package org.example;

import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogManager().getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it
        System.out.println("-----Welcome to Calculator-----\n" +
                "Choose your operation\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exit");
        Scanner input = new Scanner(System.in);
//        int option = input.nextInt();
//        switch(option){
//            case
//        }
    }
}