package lab1;

import java.util.Scanner;

public class Numbers {
    public static int gcd(int a, int b) {
        return b==0 ? a : gcd(b,a%b);
    }
    public static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();
        System.out.print("Введите числа: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        int a = numbers[0];
        int b = numbers[1];
        System.out.println("НОД: " + gcd(a, b));
        System.out.println("НОК: " + lcm(a, b));

        for (int i=0;i<n;i++){
            int num = numbers[i];
            if(checkSimple(num))
                System.out.println("Простое число : " + num);
        }
    }
}
