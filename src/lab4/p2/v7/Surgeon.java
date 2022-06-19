package lab4.p2.v7;

public class Surgeon implements Doctor{
    String position;
    String name;

    public Surgeon(String position, String name) {
        this.position = position;
        this.name = name;
    }

    @Override
    public boolean treatment() {
        System.out.println("Surgeon treats");
        return false;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
