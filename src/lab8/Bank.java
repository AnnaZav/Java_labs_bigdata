package lab8;

import java.util.Random;

public class Bank {
    static int account = 100;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начальная сумма: " + account);
        Random random = new Random();
        int max = 100;
        int min = 1;

        BankThread replenishment = new BankThread("+");
        BankThread debit = new BankThread("-");
        replenishment.start();
        debit.start();

        replenishment.changeAccount(random.nextInt(max - min) + min);
        debit.changeAccount(random.nextInt(max - min) + min);
        replenishment.changeAccount(random.nextInt(max - min) + min);
        debit.changeAccount(random.nextInt(max - min) + min);
        debit.changeAccount(random.nextInt(max - min) + min);
        debit.changeAccount(random.nextInt(max - min) + min);
        debit.changeAccount(random.nextInt(max - min) + min);

        replenishment.setFlag(false);
        System.out.println("Replenishment stopped!");
        debit.setFlag(false);
        System.out.println("Debit stopped!");

        System.out.println("Итоговая сумма: " + account);
    }
}

class BankThread extends Thread {

    private String sign;
    private boolean flag = true;

    public BankThread(String sign) {
        this.sign = sign;
    }

    public void changeAccount(int amount){
        System.out.println(Bank.account + " " + this.sign + " " + amount);
        if (this.sign == "+") Bank.account = Bank.account + amount;
        if (this.sign == "-") {
            if (Bank.account < amount){
                System.out.println("Недостаточно средств");
            } else Bank.account = Bank.account - amount;
        }
        System.out.println(" = " + Bank.account);
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}