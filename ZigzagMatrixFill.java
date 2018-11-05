package Edition;

import java.util.Scanner;

public class ZigzagMatrixFill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        Integer Str = scan.nextInt();
        int [][] Matrix = new int[Str][Str];
        int colum = Str;
        int row   =Str;
        int x, y, value = 1;

        for (int diag = 0; diag < colum; diag++)
        {
            if (diag % 2 == 0)
            {
                x = 0;
                y = diag;

                while (y >= 0)
                {
                    Matrix[x][y] = value;
                    value++;
                    x++;
                    y--;
                }
            }
            else
            {
                x = diag;
                y = 0;

                while (x >= 0)
                {
                    Matrix[x][y] = value;
                    value++;
                    x -= 1;
                    y +=  1;
                }
            }
        }
        for (int diag = 1; diag < colum; diag++)
        {
            if (diag % 2 == 0)
            {
                x = 9;
                y = diag;

                while (y <= 9)
                {
                    Matrix[x][y] = value;
                    value++;
                    x--;
                    y++;
                }
            }
            else
            {
                x = diag;
                y = 9;

                while (x <= 9)
                {
                    Matrix[x][y] = value;
                    value++;
                    x++;
                    y--;
                }
            }
        }

        // вывод масиива на экран
        for (int ix = 0; ix < row; ix++) {
            for (int jx = 0; jx < colum; jx++){
                System.out.print(" " + Matrix[ix][jx])  ;
        }
        System.out.println();
    }
//        for (int i=0;i<Str;i++){
//            for (int j=0;j<Str;j++) {
//
//            }
//        }




//            Matrix[0][i]=i+1;
//            System.out.print("  " + Matrix[0][i]);
//        }
//        System.out.println();
//        for (int i=1;i<Str;i++){
//            for (int j=0;j<Str;j++) {
//                Matrix[i][j]=j+10*i+1;
//                System.out.print(" " + Matrix[i][j]);
//            }
//            System.out.println();

    }
}
