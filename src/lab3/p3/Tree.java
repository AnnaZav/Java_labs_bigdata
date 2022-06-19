package lab3.p3;

import java.util.ArrayList;

public class Tree {
    ArrayList<Leave> leaves = new ArrayList<Leave>();
    int leave_number;
    public Tree(int num){
        this.leave_number = num;
        for (int i=0; i < leave_number; i++)
            leaves.add(new Leave());
    }
    public void bloom(){
        for (int i=0; i < leave_number; i++)
            this.leaves.get(i).bloom();
    }
    public void fall(){
        for (int i=0; i < leave_number; i++)
            this.leaves.get(i).fall();
    }
    public void ice(){
        for (int i=0; i < leave_number; i++)
            this.leaves.get(i).ice();
    }
    public void to_yellow(){
        for (int i=0; i < leave_number; i++)
            this.leaves.get(i).to_yellow();
    }

    @Override
    public String toString() {
        String str = "";
        for (int i=0; i < leave_number; i++)
            str = str + this.leaves.get(i).toString() + '\n';
        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tree tree = (Tree) o;

        if (leave_number != tree.leave_number) return false;
        return leaves.equals(tree.leaves);
    }

    @Override
    public int hashCode() {
        int result = leaves.hashCode();
        result = 31 * result + leave_number;
        return result;
    }

    public static void main(String[] args) {
        Tree oak = new Tree(5);
        oak.bloom();
        Tree oak2 = new Tree(5);
        oak2.bloom();
        System.out.println(oak.toString());
        System.out.println(oak.hashCode());
        System.out.println(oak.equals(oak2));
    }
}
