package _08_array.ex;

import java.util.Scanner;

public class ArrayEX6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];


        System.out.println(n + "개의 정수를 입력하세요 : ");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int i = 0; i < n; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("가장 큰 정수 : " + maxNumber);
        System.out.println("가장 작은 정수 : " + minNumber);


    }
}
