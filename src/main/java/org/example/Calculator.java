package org.example;
import java.util.Scanner;

public class Calculator {
    private double lastResult;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход");
            System.out.print("Введите номер: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("До свидания!");
                break;
            }

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    break;
                case 2:
                    result = subtraction(num1, num2);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    break;
                case 4:
                    result = division(num1, num2);
                    if (num2 == 0){
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Неверный пункт меню. Попробуйте снова.");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println("Результат: " + result);
            }
        }
        scanner.close();
    }

    public double addition(double a, double b){
        lastResult = a + b;
        return lastResult;
    }

    public double subtraction(double a, double b){
        lastResult = a - b;
        return lastResult;
    }

    public double multiplication(double a, double b){
        lastResult = a * b;
        return lastResult;
    }

    public double division(double a, double b){
        if (b == 0){
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        } else {
            lastResult = a / b;
            return  lastResult;
        }
    }
}