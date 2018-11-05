package Edition;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int Dan = scan.nextInt();
        if (Dan % 2 == 0 || Dan % 3 == 0) System.out.println(Dan + " Составное число");
        else System.out.println(Dan + " Не составное число");
        for (int i =0; i<100;i++){
            if (i % 2 == 0 || i % 3 == 0) System.out.print(i + " ");
        }
    }
}
