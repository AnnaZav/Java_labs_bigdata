package lab7.p2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordLength {
    public static void main(String[] args) {
        Path input_file = Paths.get("src/lab5/p3/zabolotsky.txt");
        List<String> text = new ArrayList<String>();
        try {
            text = Files.readAllLines(input_file, StandardCharsets.UTF_8);
            for (String line : text)
                System.out.println(line);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        for (int i = 0; i < text.size(); i++)
            text.set(i,text.get(i).replaceAll("  |[^А-я ]", ""));

        int min_len = 100, max_len = 0;
        String line;
        String[] words;

        for (int i = 0; i < text.size(); i++) {
            words = text.get(i).split(" ");
            for(String word : words) {
                if(word.length() < min_len) {
                    min_len = word.length();
                }
                if(word.length() > max_len) {
                    max_len = word.length();
                }
            }
        }
        System.out.println("Слова наименьшей длины");
        for (int i = 0; i < text.size(); i++) {
            words = text.get(i).split(" ");
            for(String word : words) {
                if(word.length() == min_len) System.out.println(word);
            }
        }

        System.out.println("Слова наибольшей длины");
        for (int i = 0; i < text.size(); i++) {
            words = text.get(i).split(" ");
            for(String word : words) {
                if(word.length() == max_len) System.out.println(word);
            }
        }
    }
}
