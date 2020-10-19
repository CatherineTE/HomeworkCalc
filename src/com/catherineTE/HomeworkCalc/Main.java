package com.catherineTE.HomeworkCalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!"W".equals(userInput)) {
            System.out.println("Введите первое число");
            int firstNumber = scanner.nextInt();
            System.out.println("Введите операцию");
            userInput = scanner.next();

            int secondNumber = 0;
            if (!userInput.equals("!")) {
                System.out.println("Введите второе число");
                secondNumber = scanner.nextInt();
            }

            double result = 0;
            switch (userInput) {
                case "+":
                    result = sum(firstNumber, secondNumber);
                    System.out.println(firstNumber + userInput + secondNumber + " = " + result);
                    break;
                case "-":
                    result = sub(firstNumber, secondNumber);
                    System.out.println(firstNumber + userInput + secondNumber + " = " + result);
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("На ноль делить нельзя!");
                        break;
                    }
                    result = div(firstNumber, secondNumber);
                    System.out.println(firstNumber + userInput + secondNumber + " = " + result);
                    break;
                case "*":
                    result = mult(firstNumber, secondNumber);
                    System.out.println(firstNumber + userInput + secondNumber + " = " + result);
                    break;
                case "!":
                    result = fact(firstNumber);
                    System.out.println(firstNumber + userInput + " = " + result);
                    break;
                default:
                    System.out.println("Не удалось посчитать!");
                    break;
            }
        }
        System.out.println("Выход из калькулятора");
    }

    public static int sum (int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int sub (int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static double div (int numberOne, int numberTwo) {
        return ((double) numberOne) / numberTwo;
    }

    public static int mult (int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

// Реализация через FOR
//    public static int fact (int number) {
//        int result = 1;
//        for (int i = 1; i <= number; i++) {
//            result = result * i;
//        }
//        return result;
//    }

    public static int fact (int number) {
        int i = 1;
        int result = 1;
        while (i <= number) {
            result = result * i++;
        }
        return result;
    }

}
