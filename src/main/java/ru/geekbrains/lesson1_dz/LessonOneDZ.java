package ru.geekbrains.lesson1_dz;

import java.util.Scanner;

public class LessonOneDZ {
    public static void main (String[] args){

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();

    }

    private static void exercise1() {
        System.out.println("Задание 1: Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, где a, b, c, d – аргументы этого метода, имеющие тип float");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a"); // на лекции этого нет, но в курсе Java быстрый старт было, воспользовался
        float a = scanner.nextFloat();
        System.out.println("Введите число b");
        float b = scanner.nextFloat();
        System.out.println("Введите число c");
        float c = scanner.nextFloat();
        System.out.println("Введите число d");
        float d = scanner.nextFloat();
        float result = a * (b + (c / d));
        System.out.println("Результат выражения" + result);
    }
    private static void exercise2(){
        System.out.println("Задание 2: Метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int sum = a+b;
        boolean bool = sum >= 10 && sum <= 20;
        System.out.println(bool);
    }
    private static void exercise3(){
        System.out.println("Задание 3: Метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        if ( a >= 0 ) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }
    private static void exercise4(){
        System.out.println("Задание 4: Метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        boolean bool = a >= 0;
        System.out.println(!bool);

    }
    private static void exercise5(){
        System.out.println("Задание 5: Метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");
        String s1 = "Привет ";
        String s2 = scanner.next();
        String s3 = " !";
        String result = s1+s2+s3;
        System.out.println(result);
    }
    private static void exercise6(){
        System.out.println("Задание 6: Метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scanner.nextInt();
     //   int x1 = a/4;
        int x2 = a%4;
     //  int x3 = a/100;
        int x4 = a%100;
      //  int x5 = a/400;
        int x6 = a%400;
        if ( x6 == 0 ) {
            System.out.println("Год Високосный");

        } else if (x2 ==0 && x4 != 0) {
            System.out.println("Год Високосный");
        } else {
            System.out.println("Год не Високосный");
        }

    }
}

     //   System.out.println("Введите число a");