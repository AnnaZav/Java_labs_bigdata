package lab3.p3;

import java.util.ArrayList;

public class Piano {
    ArrayList<Key> keys = new ArrayList<Key>();
    int key_number;
    public Piano(int num){
        this.key_number = num;
        for (int i=0; i < key_number; i++)
            keys.add(new Key());
    }
    public void setup(){
        for (int i=0; i < key_number; i++)
            this.keys.get(i).setup();
    }
    public void play(){
        for (int i=0; i < key_number; i++)
            this.keys.get(i).pushKey();
    }

    @Override
    public String toString() {
        return "Piano{" +
                "keys=" + keys +
                ", key_number=" + key_number +
                '}' + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Piano piano = (Piano) o;

        if (key_number != piano.key_number) return false;
        return keys.equals(piano.keys);
    }

    @Override
    public int hashCode() {
        int result = keys.hashCode();
        result = 31 * result + key_number;
        return result;
    }

    public static void main(String[] args) {
        Piano piano = new Piano(5);
        piano.setup();
        Piano piano2 = new Piano(5);
        piano2.play();
        piano.play();
        System.out.println(piano.toString());
        System.out.println(piano2.toString());
        System.out.println(piano.hashCode());
        System.out.println(piano.equals(piano2));
    }
}
