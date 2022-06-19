package lab7.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decryption {
    public static void main(String[] args) {
        String string = "Нош к, мли2571;_ елотс сва 3 80:  бьйетсиом1469 # !";
        System.out.println(string);
        char[] decrypted = new char[51];
        Pattern pattern = Pattern.compile("(?:.{17})+?");
        Matcher matcher = pattern.matcher(string);
        int idx = 0;
        while (matcher.find()) {
            int start = matcher.start(0);
            int end = matcher.end(0);
            String s = string.substring(start, end);
            for (int i = 0; i < s.length(); i++)  {
                if (i == 0)
                    decrypted[idx] = s.charAt(i);
                else
                    decrypted[idx+i*3] = s.charAt(i);
            }
            idx+=1;
        }
        System.out.println(decrypted);
    }
}
