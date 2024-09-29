package _03_oop.ex;

public class Account {
    int balance; // 잔액

    // 입금
    void deposit(int amount) {
        balance += amount;
    }

    // 출금
    void withdraw(int amount) {
        if (balance > amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    // 잔액
    void showAmout() {
        System.out.println("잔고: " + balance);
    }
}
