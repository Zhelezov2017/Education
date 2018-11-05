package Edition;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;

public class WorkFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("D://Java//File test","Test2.txt");
        ArrayList brackets = new ArrayList();
        int i=0,j =0;
        try(FileReader reader = new FileReader("D://Java//File test//Test1.txt")){
            int c;
            while((c=reader.read())!=-1){
                if ((char) c == '{') {brackets.add('{'); i++;}
                if ((char) c == '}') {brackets.add('{'); j++;}
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileWriter writer = new FileWriter("D://Java//File test//Test2.txt")){
            if (i==j) writer.append("Баланс скобок не нарушен");
            if (i!=j) writer.append("Баланс скобок нарушен");
            System.out.println();
            }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
