package lab3.p4;

import lab3.p3.Key;
import lab3.p3.Leave;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Subscriber {
    int number;
    int count;
    boolean available;
    ArrayList<Boolean> services = new ArrayList<Boolean>();
    public Subscriber(int num){
        this.number = num;
        this.count = 0;
        this.available = true;
        for (int i=0; i < 5; i++)
            services.add(new Boolean(true));
    }
    public void payServices(int money){
        this.count = this.count + money;
        if (this.count > 0) this.available = true;
    }
    public void askChangeNum(Administrator admin, int num){
        admin.setNumber(this, num);
    }
    public void askDeclineService(Administrator admin, int index){
        admin.declineService(this, index);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "number=" + number +
                ", count=" + count +
                ", available=" + available +
                ", services=" + services +
                '}' + '\n';
    }
}
