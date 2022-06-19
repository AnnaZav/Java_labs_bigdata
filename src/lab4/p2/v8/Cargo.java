package lab4.p2.v8;

public class Cargo implements Ship {
    String name;
    int num;

    public Cargo(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public boolean toSail() {
        System.out.println("Cargo ship");
        return false;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
