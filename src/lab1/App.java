package lab1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);
    }
}
