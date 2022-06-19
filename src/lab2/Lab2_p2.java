package lab2;

import java.util.Date;
import java.util.Scanner;

public class Lab2_p2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = in.nextInt();
        System.out.print("Введите слова: ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        int[] flags = new int[] {-1, -1};
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (word.matches("[-+]?\\d+")) {
                String reversedString = new StringBuffer(word).reverse().toString();
                if (word.equals(reversedString)) {
                    if (flags[0] == -1){
                        flags[0] = i;
                    } else if (flags[1] == -1){
                        flags[1] = i;
                    }
                }
            }
        }
        if (flags[1] != -1){
            System.out.println(words[flags[1]]);
        }else if (flags[0] != -1) System.out.println(words[flags[0]]);

        System.out.println("Завьялова Анна Павловна");
        Date date = new Date();
        System.out.println(date.toString());
    }
}
