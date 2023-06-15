package com.company;

import java.util.Scanner;
class Calculator<T extends Number> {
    private T number_1;
    private T number_2;

    public Calculator(T number_1, T number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public T calculate(String operation) {
        switch(operation) {
            case "+":
                return (T) (Double.valueOf(number_1.doubleValue() + number_2.doubleValue()));
            case "-":
                return (T) (Double.valueOf(number_1.doubleValue() - number_2.doubleValue()));
            case "*":
                return (T) (Double.valueOf(number_1.doubleValue() * number_2.doubleValue()));
            case "/":
                return (T) (Double.valueOf(number_1.doubleValue() / number_2.doubleValue()));
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1-е значение: ");
        double value1 = scanner.nextDouble();

        System.out.print("Введите 2-е значение: ");
        double value2 = scanner.nextDouble();

        System.out.print("Выберите операцию(+-*/): ");
        String operator = scanner.next();

        // объект калькулятора
        Calculator<Double> calculator = new Calculator<>(value1, value2);
        
        Double result = calculator.calculate(operator);
        if (result == null) {
            System.out.println("Что-то пошло не так с операциями!");
        } else {
            System.out.println("Желаемый результат: " + result);
        }
    }
}
