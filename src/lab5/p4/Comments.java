package lab5.p4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comments {
    public static void main(String[] args) throws IOException {
        String program_with_comments = new String(
                "System.out.println(\"Hello, Java world!\");\n" +
                "// наш комментарий\n" +
                "/*\n" +
                " Пример простой программы на Java\n" +
                "*/\n" +
                "public class SampleProgram\n" +
                "{\n" +
                "    public static void main (String [] args)\n" +
                "    {\n" +
                "        System.out.println(\"Hello, Java world!\");\n" +
                "    }\n" +
                "}\n" +
                "/**\n" +
                " * <p>Проверяет, допустимый ли ход.</p>\n" +
                " * <p>Например, чтобы задать ход e2-e4, напишите isValidMove(5,2,5,4);\n" +
                " * Чтобы записать рокировку, укажите, откуда и куда ходит король.\n" +
                " * Например, для короткой рокировки чёрных запишите isValidMove(5,8,7,8);</p>\n" +
                "*/");
        System.out.println(program_with_comments);
        System.out.println();
        // экзамен 20.06 пн 9:00 каф
        int idx_begin = 0, idx_end;
        String result = program_with_comments.replaceAll("//.*?\n", "");
        result = result.replaceAll("\\/\\*\n(.*?\n)*\\*\\/\n", "");
        result = result.replaceAll("\\/\\*\\*\n(.*?\n)*\\*\\/", "");
        System.out.println(result);

        File folder = new File("C:\\Users\\Xiaomi\\Documents\\ycheba\\10\\java\\java_labs\\src\\lab5\\p4"+
                File.separator + "comments");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File program_file = new File(folder, "p4_v8" + ".txt");
        program_file.createNewFile();
        OutputStream os = new FileOutputStream(program_file);
        byte[] strToBytes = result.getBytes();
        os.write(strToBytes);
        os.close();
    }
}

