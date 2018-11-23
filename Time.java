package Edition;


import java.util.Date;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        System.out.print("Введите время: ");
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        date.setTime(scan.nextInt());
    }
}
