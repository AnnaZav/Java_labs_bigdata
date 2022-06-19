package lab5.p1;

import java.util.Scanner;

public class FractionWithExeption {
    int m, n;
    FractionWithExeption(){
        m = 1;
        n = 1;
    }
    FractionWithExeption(int x, int y){
        m = x;
        n = y;
    }
    void displayInfo(){
        System.out.printf("Dividend: %s \tDivider: %d\n", m, n);
    }
    public static FractionWithExeption add(FractionWithExeption x, FractionWithExeption y) {
        return new FractionWithExeption(x.m * y.n + y.m * x.n, x.n * y.n);
    }

    public static FractionWithExeption sub(FractionWithExeption x, FractionWithExeption y) {
        return new FractionWithExeption(x.m * y.n - y.m * x.n, x.n * y.n);
    }

    public static FractionWithExeption mul(FractionWithExeption x, FractionWithExeption y) {
        return new FractionWithExeption(x.m * y.n, x.n * y.n);
    }

    public static FractionWithExeption div(FractionWithExeption x, FractionWithExeption y) {
        return new FractionWithExeption(x.m * y.n, x.n * y.m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int k = 0;
        try {
            k = in.nextInt();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Введите корректный размер массива");
        }
        int[] fractions = new int[k];
        int x,y;
        FractionWithExeption[] fracts = new FractionWithExeption[k];
        for (int i = 0; i < k; i++) {
            System.out.println("Введите дробь: ");
            try {
                x = in.nextInt();
                y = in.nextInt();
                fracts[i] = new FractionWithExeption(x, y);
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Не удалось создать дробь");
            }
        }

        try {
            for (int i = 0; i < k; i++) {
                System.out.println("Дробь: " + fracts[i].m + "/" + fracts[i].n);
            }
            modify(fracts, k);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Не удалось модифицировать дробь");
        }

    }
    public static void modify(FractionWithExeption[] f_arr, int k){
        int size = k % 2 == 0 ? k/2 : k/2 + 1;
        FractionWithExeption fm = new FractionWithExeption();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0 & i < k-1) {
                fm = add(f_arr[i], f_arr[i+1]);
            } else fm = f_arr[i];
            System.out.println("Модифицированная дробь: " + fm.m + "/" + fm.n);
        }
    }
}

