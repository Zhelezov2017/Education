package Edition;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите число a: ");
        Integer A = scan.nextInt();
        System.out.print("Введите число b: ");
        Integer B = scan.nextInt();
        double [][] Matrix = new double[10][10];
        System.out.println("Сгенерированный массив: ");
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                Matrix[i][j] =A + random.nextDouble()*(B-A);
                System.out.print(" " + Matrix[i][j]);
            }
            System.out.println();
        }
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j =0; j < Matrix.length;j++)
                if (Matrix[i][j] < Matrix[indexOfMax][indexOfMin])
                {
                indexOfMin = j;
                indexOfMax = i;
                }

        }
        System.out.println();
        System.out.println("Минимальный эллемент");

        System.out.println( + Matrix[indexOfMax][indexOfMin] );

        double Number =0;
        for (int i=0;i<Matrix.length;i++){
            Number = Matrix[0][i];
            Matrix[0][i] = Matrix[indexOfMax][i];
            Matrix[indexOfMax][i] = Number;
        }
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(" " + Matrix[i][j]);
            }
            System.out.println();
        }
    }
}
