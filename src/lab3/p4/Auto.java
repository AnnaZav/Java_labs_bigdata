package lab3.p4;

public class Auto {
    boolean fix;
    String state;
    boolean available;
    public Auto() {
        this.fix = false;
        this.state = "";
        this.available = true;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "fix=" + fix +
                ", state='" + state + '\'' +
                '}';
    }
}
