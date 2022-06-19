package lab3.p1;

import java.util.Scanner;

public class Complex {
    double x;
    double y;
    public Complex(){
        this.x = 0;
        this.y = 0;
    }
    public Complex(double x) {
        this.x = x;
        this.y = 0;
    }
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void assign(double a, double b) {
        x = a;
        y = b;
    }
    public Complex conj() {
        return new Complex(x, -y);
    }
    public Complex sub(Complex b) {
        return new Complex(x - b.x, y - b.y);
    }
    public Complex add(Complex b) {
        return new Complex(x + b.x, y + b.y);
    }
    public Complex mul(Complex b) {
        return new Complex(x * b.x - y * b.y, x * b.y + y * b.x);
    }
    public Complex div(Complex b) {
        return this.mul(b.conj()).mul(1 / b.len2());
    }
    public Complex mul(double b) {
        return new Complex(x * b, y * b);
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
        int n = in.nextInt();
        double[] x_arr = new double[n];
        double[] y_arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите комплексное число: ");
            x_arr[i] = in.nextInt();
            y_arr[i] = in.nextInt();
        }
        Complex[] c_arr = new Complex[n];
        for (int i = 0; i < n; i++) {
            c_arr[i] = new Complex(x_arr[i], y_arr[i]);
            System.out.println("Комплексное число: " + c_arr[i].out());
        }
        Complex c_sum = new Complex();
        for (int i = 0; i < n; i++) {
            c_sum = c_sum.add(c_arr[i]);
        }
        System.out.println("Комплексная сумма: " + c_sum.out());
    }
}