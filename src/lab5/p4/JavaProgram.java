package lab5.p4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaProgram {
    public static void main(String[] args) throws IOException {
        String prog = new String(
                "Path input_file = Paths.get(\"src/lab5/p3/file.txt\");\n" +
                "Path    out_file = Paths.get(\"src/lab5/p3/pushkin_out.txt\");\n" +
                "               List<String> text =      new ArrayList<>();\n" +
                "List<String> result = new ArrayList<>();\n" +
                "try {\n" +
                "text = Files.readAllLines(input_file, StandardCharsets.UTF_8);\n" +
                "for     (String line : text)\n" +
                "System.out.println(line);  \n" +
                "} catch     (Exception e){\n" +
                "System.out.println(e.getMessage());\n" +
                "}");
        String result = prog.replaceAll("[\\s]{2,}", " ");
        System.out.println(result);

        File folder = new File("C:\\Users\\Xiaomi\\Documents\\ycheba\\10\\java\\java_labs\\src\\lab5\\p4"+
                                    File.separator + "java_program");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File program_file = new File(folder, "p4_v7" + ".txt");
        program_file.createNewFile();
        OutputStream os = new FileOutputStream(program_file);
        byte[] strToBytes = result.getBytes();
        os.write(strToBytes);
        os.close();
    }
}
