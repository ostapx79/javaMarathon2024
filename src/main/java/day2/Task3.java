package day2;

import java.util.Scanner;

public class Task3 {
    /*
    3. Реализовать программу №2, используя цикл while.
     */
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) System.out.println("Некорректный ввод");
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0) System.out.print(a + " ");
            a++;
        }
    }
}
