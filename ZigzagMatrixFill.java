package Edition;

import java.util.Scanner;

public class ZigzagMatrixFill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        Integer Str = scan.nextInt();
        int [][] Matrix = new int[Str][Str];
        for (int i=0;i<Str;i++){
            Matrix[0][i]=i+1;
            System.out.print("  " + Matrix[0][i]);
        }
        System.out.println();
        for (int i=1;i<Str;i++){
            for (int j=0;j<Str;j++) {
                Matrix[i][j]=j+10*i+1;
                System.out.print(" " + Matrix[i][j]);
            }
            System.out.println();
        }
    }
}
