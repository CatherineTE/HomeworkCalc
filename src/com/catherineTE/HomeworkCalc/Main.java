package com.catherineTE.HomeworkCalc;

import java.util.Scanner;

public class Main {

    static int firstNumber = 0;
    static int secondNumber = 0;
    static String userInput = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!"W".equals(userInput)) {
            System.out.println("Введите первое число");
            firstNumber = scanner.nextInt();
            System.out.println("Введите операцию");
            userInput = scanner.next();
            if (!userInput.equals("!")) {
                System.out.println("Введите второе число");
                secondNumber = scanner.nextInt();
            }

            double result = 0;
            switch (userInput) {
                case "+":
                    result = sum();
                    break;
                case "-":
                    result = sub();
                    break;
                case "/":
                    if (secondNumber == 0) {
                        System.out.println("На ноль делить нельзя!");
                        break;
                    }
                    result = div();
                    break;
                case "*":
                    result = mult();
                    break;
                case "!":
                    result = fact();
                    break;
                default:
                    System.out.println("Не удалось посчитать!");
                    continue;
            }
            System.out.println(firstNumber + userInput + ("!".equals(userInput) ? "" : secondNumber) + " = " + result);
        }
        System.out.println("Выход из калькулятора");
    }

    public static int sum() {
        return firstNumber + secondNumber;
    }

    public static int sub() {
        return firstNumber - secondNumber;
    }

    public static double div() {
        return ((double) firstNumber) / secondNumber;
    }

    public static int mult() {
        return firstNumber * secondNumber;
    }

// Реализация через FOR
//    public static int fact (int number) {
//        int result = 1;
//        for (int i = 1; i <= number; i++) {
//            result = result * i;
//        }
//        return result;
//    }

    public static int fact() {
        int i = 1;
        int result = 1;
        while (i <= firstNumber) {
            result = result * i++;
        }
        return result;
    }

}
