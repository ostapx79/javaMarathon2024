package day1;

public class Task5 {
    public static void main(String[] args) {
        int yearStart = 1980;
        int yearFinish = 2020;

        for (; yearStart <= yearFinish; yearStart += 4) {
            System.out.println("Олимпиада " + yearStart + " года");
        }
    }
}
