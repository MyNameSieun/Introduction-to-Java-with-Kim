package _07_Scanner.ex;

import java.util.Scanner;

public class ScannerEX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 :");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요 : ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = scanner.nextInt();

        int total = foodPrice * foodQuantity;

        System.out.println("피자 " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + total + "원입니다.");
    }
}
