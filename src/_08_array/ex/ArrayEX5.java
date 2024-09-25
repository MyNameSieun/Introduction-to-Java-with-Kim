package _08_array.ex;

import java.util.Scanner;

public class ArrayEX5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int inputNumber = scanner.nextInt();

        int[] inputUser = new int[inputNumber];


        System.out.println(inputNumber + " 개의 정수를 입력하세요 : ");
        int sum = 0;
        for (int i = 0; i < inputNumber; i++) {
            inputUser[i] = scanner.nextInt();
            sum += inputUser[i];
        }

        double average = (double) sum / inputUser.length;

        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);

    }
}
