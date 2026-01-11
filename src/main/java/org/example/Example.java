package org.example;

import java.util.List;

public class Example {

    public static void main(String[] args) {
        // Целочисленные типы (отличаются размером чисел, которые в них могут храниться)
        byte aByte = 0; // -128 + 127 ---- занимает 8b
        short aShort = 0; // -32768 + 32767 ---- занимает 16b
        int aInt = 0; // -14 миллиардов ---- занимает 32b
        long aLong = 0L; // ---- занимает 64b

        // Типы с плавающей точкой
        float aFloat = 0.0F;
        double aDouble = 0.0;

        // Символьный тип
        char aChar = 'a';

        // Логический тип
        boolean aBoolean = true;

        // Строка (и бесконечность других объектных/ссылочных классов)
        String toBePrinted = "Hello World!";
        // List<String> = List.of("a", "b", "c");

        class Cup {
            String color = "grey";
            int capacity = 250;
            boolean hasHandle = true;
        }

        // Операторы
        // Оператор присвоения =
        String nameFirst = "Polly";
        int age = 25;
        // Арифметические операторы + - / * % ++ --
        System.out.println(4.0 / 3);
        // Операторы сравнения <, >, <=, >=, !=, ==
        System.out.println(3 == 2);

        String nameSecond = "Alex";
        // System.out.println(nameFirst == nameSecond); нельзя сравнивать строки через ==
        System.out.println(nameFirst.equals(nameSecond));

        // Логические операторы &, |, &&, ||, !
        System.out.println(nameFirst .equals("Polly") && age==25);

        // Оператор instanceof
        System.out.println(nameFirst instanceof String);

        // Тернарный оператор
        char sex = 'm';
        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";

        // Управляющая конструкция if // встречается чаще, чем тернарный оператор
        if (sex == 'm') {
            childName = "Valentin";
        } else {
            childName = "Valentina";
        }

        // Ключевое слово new
        String name = new String ("Polina");



        System.out.println(toBePrinted);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}