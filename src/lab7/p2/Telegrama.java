package lab7.p2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Telegrama {
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

        int num_of_words = 0;
        String[] words;
        for (int i = 0; i < text.size(); i++) {
            words = text.get(i).split(" ");
            num_of_words+= words.length;
        }
        int cost = 5;

        System.out.println("Цена телеграммы 5 * " + num_of_words + " = " + cost * num_of_words);
    }
}
