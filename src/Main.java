public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 6");


        System.out.println("Aufgabe 1");
        for (int i = 0; i < 10; i ++){
            System.out.println(i);
        }

        System.out.println("Aufgabe 2");
        for (int i = 10; i > 0; i --) {
            System.out.println(i);
        }

        System.out.println("Aufgabe 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Aufgabe 4");
        for (int i = 10; i >= - 10; i --) {
            System.out.println(i);
        }

        System.out.println("Aufgabe 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println( i +  " год является високосным");
        }

        System.out.println("Aufgabe 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Aufgabe 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Aufgabe 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Aufgabe 9");
        for (int i = 0; i < 12; i++) {
            total = accumulation * 1 /100;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Aufgabe 10");
        int multiplier = 2;
        for (int i = 1; i <= 10 ; i++) {
            total = multiplier * i;
            System.out.println(multiplier + " * " + i + " = " + total);
        }
    }
}