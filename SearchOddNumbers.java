package Edition;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SearchOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        Integer Str = scan.nextInt();
        int [] Matrix = new int[Str];
        ArrayList OldNumber = new ArrayList();
        Random random = new Random();
        for (int i=0;i<Str;i++){
            Matrix[i] =-100+random.nextInt(200);
            System.out.print(" " + Matrix[i]);
            if (Matrix[i]%2 !=0){
                OldNumber.add(Matrix[i]);
     //           System.out.println(OldNumber[i]);
            }
        }
        System.out.println();
        for (int j=0;j<OldNumber.size();j++) System.out.print(" " + OldNumber.get(j));
    }
}
