package _08_array.ex;

import java.util.Scanner;

public class ArrayEX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("입력한 점수의 합계 : " + sum);
        System.out.println("입력한 점수의 평균 : " + average);
    }
}
