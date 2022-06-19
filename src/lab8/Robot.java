package lab8;

import java.util.Scanner;

public class Robot {
    static int limit = 18;
    static LegPoint left_leg = new LegPoint(8,0,limit);
    static LegPoint right_leg = new LegPoint(9,0,limit);

    public static void paintField(){
        for (int i=0;i<limit;i++){
            for (int j=0;j<limit;j++) {
                if (left_leg.y == i & left_leg.x == j){
                    System.out.print(" L ");
                } else if (right_leg.y == i & right_leg.x == j) {
                    System.out.print(" R ");
                } else System.out.print(" . ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поле для хотьбы");
        paintField();

        LegThread left = new LegThread(left_leg, "Левая нога");
        LegThread right = new LegThread(right_leg, "Правая нога");
        left.start();
        right.start();
    }
}

class LegThread extends Thread {

    private LegPoint leg;
    private String leg_name;
    private boolean flag = true;

    public LegThread(LegPoint leg, String name) {
        this.leg = leg;
        this.leg_name = name;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        while (flag) {
            System.out.println(this.leg_name);
            System.out.println("Введите направление: ");
            String dir = in.next();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.leg.x == this.leg.limit | this.leg.y == this.leg.limit) {
                System.out.println("Робот достиг края поля, начинайте идти заново");
                this.flag = false;
            } else {
                this.leg.changeLegPoint(dir);
//                Robot.paintField();
            }
        }
    }
}

class LegPoint{
    public int x, y, limit;
    public LegPoint(int x, int y, int limit){
        this.x = x;
        this.y = y;
        this.limit = limit;
    }
    public void changeLegPoint(String direction){
        System.out.println(direction);
            this.y += 1;
            if (direction == "LEFT") {
                this.x -= 1;
            } else if (direction == "RIGHT") this.x += 1;
    }
}