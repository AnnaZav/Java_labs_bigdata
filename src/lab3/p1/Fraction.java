package lab3.p1;

import java.util.Scanner;

public class Fraction {
    int m, n;
    Fraction(){
        m = 1;
        n = 1;
    }
    Fraction(int x, int y){
        m = x;
        n = y;
    }
    void displayInfo(){
        System.out.printf("Dividend: %s \tDivider: %d\n", m, n);
    }
    public static Fraction add(Fraction x, Fraction y) {
        return new Fraction(x.m * y.n + y.m * x.n, x.n * y.n);
    }

    public static Fraction sub(Fraction x, Fraction y) {
        return new Fraction(x.m * y.n - y.m * x.n, x.n * y.n);
    }

    public static Fraction mul(Fraction x, Fraction y) {
        return new Fraction(x.m * y.n, x.n * y.n);
    }

    public static Fraction div(Fraction x, Fraction y) {
        return new Fraction(x.m * y.n, x.n * y.m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int k = in.nextInt();
        int[] fractions = new int[k];
        int x,y;
        Fraction[] fracts = new Fraction[k];
        for (int i = 0; i < k; i++) {
            System.out.print("Введите дробь: ");
            x = in.nextInt();
            y = in.nextInt();
            fracts[i] = new Fraction(x,y);
        }
        for (int i = 0; i < k; i++) {
            System.out.println("Дробь: " + fracts[i].m + "/" + fracts[i].n);
        }
        modify(fracts, k);

    }
    public static void modify(Fraction[] f_arr, int k){
        int size = k % 2 == 0 ? k/2 : k/2 + 1;
        Fraction fm = new Fraction();
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0 & i < k-1) {
                fm = add(f_arr[i], f_arr[i+1]);
            } else fm = f_arr[i];
            System.out.println("Модифицированная дробь: " + fm.m + "/" + fm.n);
        }
    }
}

