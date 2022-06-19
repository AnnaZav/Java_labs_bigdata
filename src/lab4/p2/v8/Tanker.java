package lab4.p2.v8;

public class Tanker extends Cargo{
    public Tanker(String name, int num) {
        super(name, num);
    }

    @Override
    public boolean toSail() {
        System.out.println("Tanker ship");
        return false;
    }

    @Override
    public String toString() {
        return "Tanker{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Cargo cargo = new Cargo("Ship1", 1000);
        Tanker tanker = new Tanker("Ship2", 2000);
        System.out.println(cargo.toString());
        System.out.println(cargo.toSail());
        System.out.println(tanker.toString());
        System.out.println(tanker.toSail());
    }
}
