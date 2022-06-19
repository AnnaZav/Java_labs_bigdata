package lab2;

import java.util.Date;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = in.nextInt();
        System.out.print("Введите слова: ");
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }
        boolean flag = true;
        for (int a = 0; a < n; a++) {
            String word = words[a];
            char[] array = word.toCharArray();
            for (int i = 0; i < word.length(); i++){
                for (int j = i + 1; j < word.length(); j++) {
                    if (array[i] == array[j]) {
                        flag = false;
                        break;
                    }
                }
            if (!flag) {break;}
            }
            if (flag) {
                System.out.println("Слово без повторений: " + word);
            }else { flag = true; }
        }
        System.out.println("Завьялова Анна Павловна");
        Date date = new Date();
        System.out.println(date.toString());
    }
}
