package _05_cond.ex;

public class CondEx3 {
    public static void main(String[] args) {
        int doller = 10;
        int amountExchanged = 13000;

        if (doller < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (doller == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + amountExchanged + "원입니다.");
        }
    }
}
