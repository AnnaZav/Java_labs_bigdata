package lab7.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Encryption {
    public static void main(String[] args) {
        String string = "Небольшой текст, с символами 12345 678910 ;:#_    !";
        System.out.println(string);
        String encrypted = "";
        Pattern pattern = Pattern.compile("(?:.{3})+?");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start = matcher.start(0);
            int end = matcher.end(0);
            encrypted += string.substring(start, end-2);
        }
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start = matcher.start(0);
            int end = matcher.end(0);
            encrypted += string.substring(start+1, end-1);
        }
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            int start = matcher.start(0);
            int end = matcher.end(0);
            encrypted += string.substring(start+2, end);
        }
        System.out.println(encrypted);
    }
}
