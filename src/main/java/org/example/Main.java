package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Start of Execution");
        int option = 0;
        for(;;) {
            System.out.println("-----Welcome to Calculator------\n" +
                    "Choose your operation\n" +
                    "1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if(option == 5){
                logger.info("End of Execution");
                System.exit(0);
            }
            System.out.println("Enter 1st operand: ");
            int op1 = input.nextInt();
            System.out.println("Enter 2nd operand: ");
            int op2 = input.nextInt();
            switch (option) {
                case 1:
                    logger.info("START OP: Add");
                    System.out.println("--------Result is--------\n" +
                            op1 + " + " + op2 + " = " + add(op1, op2));
                    logger.info("END OP: Add");
                    break;
                case 2:
                    logger.info("START OP: Sub");
                    System.out.println("--------Result is--------\n" +
                            op1 + " - " + op2 + " = " + sub(op1, op2));
                    logger.info("END OP: Sub");
                    break;
                case 3:
                    logger.info("START OP: Mul");
                    System.out.println("--------Result is--------\n" +
                            op1 + " * " + op2 + " = " + mul(op1, op2));
                    logger.info("END OP: Mul");
                    break;
                case 4:
                    logger.info("START OP: Div");
                    System.out.println("--------Result is--------\n" +
                            op1 + " / " + op2 + " = " + div(op1, op2));
                    logger.info("END OP: Div");
                    break;
                case 5:
                    System.exit(0);

                    break;
                default:
                    logger.warn("Invalid input");
            }
        }
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}