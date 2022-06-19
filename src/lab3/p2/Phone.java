package lab3.p2;

import java.util.Arrays;
import java.util.Scanner;

public class Phone {
    String first_name, last_name, middle_name;
    String address, credit_number;
    int debet, credit;
    int domestic, international;

    public Phone() {
    }

    public Phone(String first_name, String last_name, String middle_name, String address, String credit_number, int debet, int credit, int domestic, int international) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.address = address;
        this.credit_number = credit_number;
        this.debet = debet;
        this.credit = credit;
        this.domestic = domestic;
        this.international = international;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCredit_number() {
        return credit_number;
    }

    public void setCredit_number(String credit_number) {
        this.credit_number = credit_number;
    }

    public int getDebet() {
        return debet;
    }

    public void setDebet(int debet) {
        this.debet = debet;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDomestic() {
        return domestic;
    }

    public void setDomestic(int domestic) {
        this.domestic = domestic;
    }

    public int getInternational() {
        return international;
    }

    public void setInternational(int international) {
        this.international = international;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", address='" + address + '\'' +
                ", credit_number='" + credit_number + '\'' +
                ", debet=" + debet +
                ", credit=" + credit +
                ", domestic=" + domestic +
                ", international=" + international +
                '}';
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество абонентов: ");
        int n = in.nextInt();
        Phone[] abonents = new Phone[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите данные абонента: ");
            abonents[i]= new Phone(in.next(), in.next(), in.next(), in.next(), in.next(),
            in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
        }
        String[] str_arr = new String[n];
        for (int i = 0; i < n; i++) {
            str_arr[i] = abonents[i].toString();
        }
        Arrays.sort(str_arr);

        int time_limit = 123;
        System.out.println("Абоненты слишком много говорят на городском: ");
        for (int i = 0; i < n; i++) {
            if (abonents[i].getDomestic() > time_limit)
                  System.out.println(str_arr[i]);
        }
        System.out.println("Абоненты используют междугородний: ");
        for (int i = 0; i < n; i++) {
            if (abonents[i].getInternational() > 0)
                System.out.println(str_arr[i]);
        }
        System.out.print("Абоненты в алфавитном порядке: ");
        for (int i = 0; i < n; i++) {
            System.out.println(str_arr[i]);
        }
    }
}
