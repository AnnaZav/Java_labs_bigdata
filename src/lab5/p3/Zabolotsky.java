package lab5.p3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Zabolotsky {
    public static void main(String[] args) throws IOException {
        Path input_file = Paths.get("src/lab5/p3/zabolotsky.txt");
        Path out_file = Paths.get("src/lab5/p3/zabolotsky_out.txt");
        List<String> text = new ArrayList<>();
        List<String> result = new ArrayList<>();
        try {
            text = Files.readAllLines(input_file, StandardCharsets.UTF_8);
            for (String line : text)
                System.out.println(line);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        for(String line: text) {
            String[] words = line.split(" ");
            String line_out = new String("");
            for(String word : words){
                word = word.substring(0,1).toUpperCase() + word.substring(1,word.length()) + " ";
                System.out.print(word);
                line_out = line_out + word;
            }
            System.out.println();
            result.add(line_out);
        }
        Files.write(out_file, result, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}
