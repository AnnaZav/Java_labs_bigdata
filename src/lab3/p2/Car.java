package lab3.p2;

import java.util.Scanner;

public class Car {
    String mark, model;
    int year, price;
    String colour;
    int reg_number;

    public Car() {
    }

    public Car(String mark, String model, int year, int price, String colour, int reg_number) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.reg_number = reg_number;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getReg_number() {
        return reg_number;
    }

    public void setReg_number(int reg_number) {
        this.reg_number = reg_number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", reg_number=" + reg_number +
                '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество автомобилей: ");
        int n = in.nextInt();
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите данные автомобиля: ");
            cars[i]= new Car(in.next(), in.next(), in.nextInt(), in.nextInt(), in.next(), in.nextInt());
        }
        String[] str_arr = new String[n];
        for (int i = 0; i < n; i++) {
            str_arr[i] = cars[i].toString();
        }
        String static_mark = "reno";
        String static_model = "cenotaph";
        int static_year = 1999;
        int static_price = 12;
        System.out.println("Автомобили марки " + static_mark);
        for (int i = 0; i < n; i++) {
            if (cars[i].getMark().equals(static_mark)){
                System.out.println(str_arr[i]);
            }
        }
        System.out.println("Автомобили модели " + static_model);
        for (int i = 0; i < n; i++) {
            if ( cars[i].getModel().equals(static_model)){
                System.out.println(str_arr[i]);
            }
        }
        System.out.println("Автомобили года " + static_year + " дороже " + static_price);
        for (int i = 0; i < n; i++) {
            if (cars[i].getYear() == static_year && cars[i].getPrice() > static_price){
                System.out.println(str_arr[i]);
            }
        }
    }
}
