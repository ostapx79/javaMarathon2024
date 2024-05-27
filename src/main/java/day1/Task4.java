package day1;

public class Task4 {
    public static void main(String[] args) {
        int yearStart = 1980;
        int yearFinish = 2020;
        // int i = yearStart;
        while (yearStart <= yearFinish) {
            System.out.println("Олимпиада " + yearStart + " года");
            yearStart += 4;
        }
    }
}
