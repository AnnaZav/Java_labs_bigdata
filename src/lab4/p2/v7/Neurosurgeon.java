package lab4.p2.v7;

public class Neurosurgeon extends Surgeon{

    public Neurosurgeon(String position, String name) {
        super(position, name);
    }

    @Override
    public boolean treatment() {
        System.out.println("Neurosurgeon treats");
        return false;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("main", "Doctor1");
        Neurosurgeon neuro = new Neurosurgeon("main", "Doctor2");
        System.out.println(surgeon.toString());
        System.out.println(surgeon.treatment());
        System.out.println(neuro.toString());
        System.out.println(neuro.treatment());
    }
}

