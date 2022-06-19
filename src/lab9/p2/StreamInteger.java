package lab9.p2;

import java.util.Arrays;
import java.util.List;

public class StreamInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 11, 11, 14, 11, 11, 11, 14, 11, 11, 11, 11);
        System.out.println(list);
        Integer first_list = list.stream().map(i -> i - 10).reduce(0, (a, b) -> a + b);
        System.out.println("Отнять 10, среднее: " + (float)first_list / list.size());
        Integer second_list = list.stream().filter(i -> i % 7 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Делятся на 7, сумма: " + second_list);
    }
    
}
