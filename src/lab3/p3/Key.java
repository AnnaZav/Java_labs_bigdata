package lab3.p3;

public class Key {
    String state;
    Boolean pressed;
    public Key(){
        this.state = "new";
        this.pressed = false;
    }
    public void setup(){
        this.state = "setup";
    }
    public void pushKey(){
        this.pressed = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Key key = (Key) o;

        if (!state.equals(key.state)) return false;
        return pressed.equals(key.pressed);
    }

    @Override
    public int hashCode() {
        int result = state.hashCode();
        result = 31 * result + pressed.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Key{" +
                "state='" + state + '\'' +
                ", pressed=" + pressed +
                '}';
    }
}
