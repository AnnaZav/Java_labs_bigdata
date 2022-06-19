package lab7.p4;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UppercaseLetter {
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

        Pattern pattern = Pattern.compile("[А-Я]");
        Matcher matcher = null;
        int upper_num = 0;
        for (int i = 0; i < text.size(); i++) {
            String line = text.get(i);
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                upper_num+=1;
            }
        }
        System.out.println(upper_num);
    }
}
