package _06_loop.ex;

public class LoopEx3_While {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }

        System.out.println("합: " + sum);
    }
}
