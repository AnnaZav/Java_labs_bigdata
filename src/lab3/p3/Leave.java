package lab3.p3;

public class Leave {
    String state;
    public Leave() {
        this.state = "new";
    }
    public void bloom(){
        this.state = "bloom";
    }
    public void fall(){
        this.state = "fall";
    }
    public void ice(){
        this.state = "ice";
    }
    public void to_yellow(){
        this.state = "yellow";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leave leave = (Leave) o;

        return state.equals(leave.state);
    }

    @Override
    public int hashCode() {
        return state.hashCode();
    }

    @Override
    public String toString() {
        return "Leave{" +
                "state='" + state + '\'' +
                '}';
    }
}
