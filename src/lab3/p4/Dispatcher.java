package lab3.p4;

import lab3.p3.Key;

import java.util.ArrayList;

public class Dispatcher {
    int num;
    ArrayList<Raid> raids = new ArrayList<Raid>();
    ArrayList<Auto> autos = new ArrayList<Auto>();
    public Dispatcher(int num){
        this.num = num;
        for (int i=0; i < 5; i++)
            raids.add(new Raid());
        for (int i=0; i < 5; i++)
            autos.add(new Auto());
    }
    public void setRaid(Driver driver){
        for (int i=0; i < 5; i++)
            if (!(raids.get(i).made)) {
                driver.raid = raids.get(i);
            }
    }
    public void setAuto(Driver driver){
        for (int i=0; i < 5; i++)
            if (this.autos.get(i).available){
                this.autos.get(i).available = false;
                driver.auto = this.autos.get(i);
            }
    }
    public void availDriver(Driver driver){
        driver.available = false;
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "num=" + num +
                ", raids=" + raids +
                ", autos=" + autos +
                '}';
    }
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher(1);
        Driver driver = new Driver("Dmitry");
        dispatcher.setRaid(driver);
        dispatcher.setAuto(driver);
        driver.askFix();
        driver.raidExec();
        driver.autoStatus("все нормально");
        System.out.println(dispatcher.toString());
        System.out.println(driver.toString());
    }
}
