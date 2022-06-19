package lab9.p1;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueStrings {
    public static void main(String[] args) {
        List<String> text = Arrays.asList(
                "Вылетев из Африки в апреле",
                "К берегам отеческой земли,",
                "Длинным треугольником летели,",
                "Утопая в небе журавли.",
                "Вытянув серебряные крылья",
                "Через весь широкий небосвод,",
                "Утопая в небе журавли.",
                "Вел вожак в долину изобилья",
                "Свой немногочисленный народ.",
                "К берегам отеческой земли,");

        List<String> unique_text = text.stream().distinct().collect(Collectors.toList());
        System.out.println(unique_text);

    }
}
