package _05_cond.ex;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 20;
        String result = (x % 2 == 1) ? "x = "+x+", 홀수" : "x = "+x+", 짝수";
        System.out.println(result);
    }
}
