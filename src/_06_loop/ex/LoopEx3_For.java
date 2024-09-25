package _06_loop.ex;

public class LoopEx3_For {
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
        }

        System.out.println("합: "+sum);
    }
}
