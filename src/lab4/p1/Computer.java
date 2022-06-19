package lab4.p1;

import java.util.ArrayList;

public class Computer {
    int num;
    ArrayList<Computer.Info> info = new ArrayList<Computer.Info>();

    public Computer(int num, int[] proc, String[] os, int[] mem) {
        this.num = num;
        for (int i = 0; i < num; i++) {
            int processor = proc[i];
            String operation = os[i];
            int memory = mem[i];
            info.add(new Computer.Info(processor, operation, memory));
        }
    }

    @Override
    public String toString() {
        String str = new String("");
        for (int i = 0; i < this.num; i++) {
            str = str + "Computer{" +
                    "info=" + info.get(i) +
                    '}' + '\n';
        }
        return str;
    }

    public class Info {
        int proc;
        String os;
        int mem;

        public Info(int proc, String os, int mem) {
            this.proc = proc;
            this.os = os;
            this.mem = mem;
        }

        @Override
        public String toString() {
            return "Transport{" +
                    "time=" + proc +
                    ", way='" + os + '\'' +
                    ", cost=" + mem +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[] processor = new int[]{1,2,3,4,5};
        String[] operation = new String[]{"one", "two", "three", "four", "five"};
        int[] memory = new int[]{6,7,8,9,10};

        Computer comp = new Computer(5, processor, operation, memory);
        System.out.println(comp.toString());
    }
}
