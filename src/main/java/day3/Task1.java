package day3;

import java.util.Scanner;

public class Task1 {
    /*
    1. Реализовать программу, используя switch, которая в консоль выводит название страны, принимая на вход
    название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
    Реализовать, используя следующие данные:
    Моква, Владивосток, Ростов - Россия
    Рим, Милан, Турин - Италия
    Ливерпуль, Манчестер, Лондон - Англия
    Берлин, Мюнхен, Кёльн - Германия

    При вводе любого другого города, вывести сообщение “Неизвестная страна”.

    Пример:
    Милан - ваш ввод в консоль
    Италия - ответ программы
    Дублин - ваш ввод в консоль
    Неизвестная страна - ответ программы
    stop - ваш ввод в консоль
    *программа завершила работу*
     */
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите имя города что-бы узнать какая страна!");
        System.out.println("Для выхода наберите: stop.");

        boolean flag = true;
        while (flag) {

            String italy = "Италия";
            String russia = "Россия";
            String english = "Англия";
            String germany = "Германия";
            String nameCity = scanner.nextLine();

            switch (nameCity) {
                case "Рим": case "Милан": case "Турин":
                    System.out.println(italy);
                    break;
                case "Моква": case "Владивосток": case "Ростов":
                    System.out.println(russia);
                    break;
                case "Лондон": case "Манчестер": case "Ливерпуль":
                    System.out.println(english);
                    break;
                case "Берлин": case "Мюнхен": case "Кёльн":
                    System.out.println(germany);
                    break;
                case "stop":
                    flag = false;
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
        System.out.println("*программа завершила работу*");
        scanner.close();
    }
}
