package lab5.p3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Pushkin {
    public static void main(String[] args) throws IOException {
        Path input_file = Paths.get("src/lab5/p3/file.txt");
        Path out_file = Paths.get("src/lab5/p3/pushkin_out.txt");
        List<String> text = new ArrayList<>();
        List<String> result = new ArrayList<>();

        try {
            text = Files.readAllLines(input_file, StandardCharsets.UTF_8);
            for (String line : text)
                System.out.println(line);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        System.out.println();
        for(String line: text) {
            String[] words = line.split(" ");
            for(String word : words){
                word = word.toLowerCase();
                if (hash.containsKey(word)){
                    hash.put(word, hash.get(word) + 1);
                } else {
                    hash.put(word, 1);
                }
                String[] symbols = word.split("");
                for (String sym : symbols) {
                    if (hash.containsKey(sym)) {
                        hash.put(sym, hash.get(sym) + 1);
                    } else {
                        hash.put(sym, 1);
                    }
                }
            }
        }
        for(String name: hash.keySet()){
            String key = name.toString();
            String val = hash.get(name).toString();
            String str = key + " - " + val;
            System.out.println(str);
            result.add(str);

        }
        Files.write(out_file, result, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
}
