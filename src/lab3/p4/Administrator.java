package lab3.p4;

public class Administrator {
    int number;
    public Administrator(int num){
        this.number = num;
    }
    public void setNumber(Subscriber subscriber, int num){
        subscriber.number = num;
    }
    public void declineService(Subscriber subscriber, int ind){
        subscriber.services.set(ind, Boolean.FALSE);
    }
    public void checkMoney(Subscriber subscriber){
        if (subscriber.count < 0)
            subscriber.available = false;
    }

    public static void main(String[] args) {
        Subscriber sub = new Subscriber(1234);
        Administrator admin = new Administrator(1);
        System.out.println(sub.toString());
        sub.payServices(10);
        sub.askChangeNum(admin,5678);
        sub.askDeclineService(admin, 3);
        System.out.println(sub.toString());

    }
}
