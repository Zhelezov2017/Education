package Edition;

import java.util.Scanner;

public class IterativeFormulaForCubicRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите x: ");
        Double X = scan.nextDouble();
        Double y0 =X;
        Double y1=0.5*(y0+3*X/(2*Math.pow(y0,2)+X/y0));
        while (Math.abs(y1-y0)> 0.00001){
            y0=y1;
            y1=0.5*(y0+3*X/(2*Math.pow(y0,2)+X/y0));

        }
        System.out.println(y1);

    }
}
