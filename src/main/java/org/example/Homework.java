package org.example;

public class Homework {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        System.out.println("Арифметические операции над int: ");
        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second + "\n");

        System.out.println("Арифметические операции над int и double: ");
        double third = 5.5;
        System.out.println(first + third);
        System.out.println(first - third);
        System.out.println(first * third);
        System.out.println(first / third + "\n");

        System.out.println("Логические операции: ");
        System.out.println(first < third);
        System.out.println(first > third);
        System.out.println(first >= third);
        System.out.println(first <= third);
        System.out.println();

        System.out.println("Диапазоны типов данных с плавающей точкой: ");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println();

        System.out.println("Перевыполнение при арифметической операции: ");
        System.out.println(Double.MAX_VALUE * 10);

        byte a = 126;
        System.out.println((byte)(a + 10));
    }
}
