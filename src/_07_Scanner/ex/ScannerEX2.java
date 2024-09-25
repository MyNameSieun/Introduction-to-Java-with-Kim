package _07_Scanner.ex;

import java.util.Scanner;

public class ScannerEX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요 : ");
        int num = scanner.nextInt();

        String result = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println("입력한 숫자 " + num + "은 " + result + "입니다.");
    }
}
