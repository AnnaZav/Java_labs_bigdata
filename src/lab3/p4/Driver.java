package lab3.p4;

public class Driver {
    String name;
    boolean available;
    Raid raid;
    Auto auto;
    public Driver(String name) {
        this.name = name;
        this.available = true;
    }
    public void askFix(){
        this.auto.fix = true;
    }
    public void raidExec(){
        this.raid.made = true;
    }
    public void autoStatus(String stat){
        this.auto.state = stat;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", available=" + available +
                ", raid=" + raid +
                ", auto=" + auto +
                '}';
    }
}
