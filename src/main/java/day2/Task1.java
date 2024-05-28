package day2;

import java.util.Scanner;

public class Task1 {
    /*
    1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число,
    соответствующее количеству этажей в здании. Используя условный оператор if, необходимо вывести в
    консоль сообщение о типе такого дома. Условия: если этажей 1-4 - "Малоэтажный дом", 5-8 - "Средне этажный дом",
    9 и более - "Многоэтажный дом". Также, необходимо учесть что может быть введено отрицательное значение,
    в таком случае сообщить "Ошибка ввода".
     */

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int floor = scanner.nextInt();
        if (floor < 1) {
            System.out.println("Ошибка ввода");
        } else if (floor < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floor < 9) {
            System.out.println("Средне этажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }


    }
//    scanner.close();
}

