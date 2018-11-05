package Edition;

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String Str = scan.nextLine();
        System.out.println(Str);
        System.out.println("Для преобразования строки в заглавные буквы нажмите : 1");
        System.out.println("Для преобразования строки в нижний регистр нфжмите : 2");
        System.out.println("Для преобразования строки с Заглавной Буквы нажмите : 3");
        System.out.println("Для преобразования строки в первый символ в нижнем регистре нажмите : 4");
        System.out.println("Для преобразования строки как в обычном предложении нажмите : 5");
        System.out.println("Для выхода нажмите : f");
        System.out.print("Введите необходимое действие : ");

        String Act = scan.nextLine();
        while(  Act  !="f"){


            switch (Act){
                case ("1"): {
                    System.out.println(Str.toUpperCase());
                    break;
                }
                case ("2"): {
                    System.out.println(Str.toLowerCase());
                    break;
                }
                case ("3"): {
                    String[] words = Str.split(" ");
                    for(String word : words){
                        String capitalized = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
                        System.out.print(" " + capitalized);
                    }
                    break;

                }
                case ("4"): {
                    String[] words = Str.split(" ");
                    for(String word : words){
                        String capitalized = Character.toLowerCase(word.charAt(0)) + word.substring(1).toUpperCase();
                        System.out.print(" " + capitalized);
                    }
                    break;

                }
                case ("5"): {
                    Str.toLowerCase();
                    String capitalized = Character.toUpperCase(Str.charAt(0)) + Str.substring(1).toLowerCase() ;
                    System.out.println(capitalized);
                    break;

                }
            }
            System.out.println();
            System.out.println("Для преобразования строки в заглавные буквы нажмите : 1");
            System.out.println("Для преобразования строки в нижний регистр нфжмите : 2");
            System.out.println("Для преобразования строки с Заглавной Буквы нажмите : 3");
            System.out.println("Для преобразования строки в первый символ в нижнем регистре нажмите : 4");
            System.out.println("Для преобразования строки как в обычном предложении нажмите : 5");
            System.out.println("Для выхода нажмите : f");
            System.out.print("Введите необходимое действие : ");
            Act = scan.nextLine();

        }
    }
}
