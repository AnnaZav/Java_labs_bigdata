package lab7.p1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DeleteSymbol {
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

        int[] flags = new int[]{0,1,0,1,0,1,0,1};
        String symbol = "б";
        int k = 5;
        for (int i=0; i < text.size(); i++){
            String line = text.get(i);
            if (flags[i] == 0){
                System.out.println(line.replaceAll(symbol, ""));
            } else{
                System.out.println(line.substring(0, k) + symbol + line.substring(k, line.length()));
            }
        }
    }
}
