package lab7.p1;

public class NoLetters {
    public static void main(String[] args) {
        String string = "Небольшой текст, с символами 12345 678910 ;:#_    !";
        System.out.println(string);
        System.out.println(string.replaceAll("  |[^А-я ]", ""));
    }
}
