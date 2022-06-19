package lab5.p1;

import java.io.IOException;
import java.util.Scanner;

public class ComplexWithExeption {
    double x;
    double y;
    public ComplexWithExeption(){
        this.x = 0;
        this.y = 0;
    }
    public ComplexWithExeption(double x) {
        this.x = x;
        this.y = 0;
    }
    public ComplexWithExeption(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void assign(double a, double b) {
        x = a;
        y = b;
    }
    public ComplexWithExeption conj() {
        return new ComplexWithExeption(x, -y);
    }
    public ComplexWithExeption sub(ComplexWithExeption b) {
        return new ComplexWithExeption(x - b.x, y - b.y);
    }
    public ComplexWithExeption add(ComplexWithExeption b) {
        return new ComplexWithExeption(x + b.x, y + b.y);
    }
    public ComplexWithExeption mul(ComplexWithExeption b) {
        return new ComplexWithExeption(x * b.x - y * b.y, x * b.y + y * b.x);
    }
    public ComplexWithExeption div(ComplexWithExeption b) {
        return this.mul(b.conj()).mul(1 / b.len2());
    }
    public ComplexWithExeption mul(double b) {
        return new ComplexWithExeption(x * b, y * b);
    }
    public double len2() {
        return x * x + y * y;
    }
    public String out(){
        return x + "i + " + y + "j";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = 0;
        try {
            n = in.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Введите корректный размер массива");
        }
        double[] x_arr = new double[n];
        double[] y_arr = new double[n];
        try{
        for (int i = 0; i < n; i++) {
            System.out.print("Введите комплексное число: ");
            x_arr[i] = in.nextInt();
            y_arr[i] = in.nextInt();
        }} catch (Exception e){
            System.out.println(e.getMessage());
        }

        ComplexWithExeption[] c_arr = new ComplexWithExeption[n];

        for (int i = 0; i < n; i++) {
            try {
                c_arr[i] = new ComplexWithExeption(x_arr[i], y_arr[i]);
                System.out.println("Комплексное число: " + c_arr[i].out());
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.print("Комплексное число не создано");
            }
        }
        ComplexWithExeption c_sum = new ComplexWithExeption();
        for (int i = 0; i < n; i++) {
            try {
                c_sum = c_sum.add(c_arr[i]);
                System.out.println("Комплексная сумма: " + c_sum.out());
            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.print("Комплексная сумма некорректна");
            }
        }
       
    }
}