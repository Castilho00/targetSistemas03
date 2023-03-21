package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String string = "hello world";
        String stringInvertida = "";

        for(int i = string.length()-1; i>=0; i--){
            stringInvertida += string.charAt(i);
        }

        input.close();
        /*
        String string = "hello world!";
        String stringInvertida = new StringBuilder(string).reverse().toString();
        System.out.println(stringInvertida);
       */
    }
}
