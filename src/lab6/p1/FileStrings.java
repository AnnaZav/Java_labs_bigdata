package lab6.p1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileStrings {
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
        Collections.sort(text);
        for (String line : text)
            System.out.println(line);
    }
}
