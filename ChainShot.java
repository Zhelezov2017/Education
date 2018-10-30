package Edition;

import java.util.Random;
import java.util.Scanner;

public class ChainShot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите n: ");
        Integer Str = scan.nextInt();
        System.out.println(Tor(Str+1));
    }
    public static Double Tor(int lol){
        lol--;
        if(lol==0) return 1.;
        return 1+1/Tor(lol) ;

        }
    }


