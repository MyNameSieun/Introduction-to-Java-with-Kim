package _09_method.ex;

public class MethodEX2 {
    public static void main(String[] args) {
        replyMessage("안녕", 3);
        replyMessage("넘 졸리당ㅠ", 2);
    }

    public static void replyMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
