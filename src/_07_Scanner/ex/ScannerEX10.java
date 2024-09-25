
package _07_Scanner.ex;

import java.util.Scanner;

public class ScannerEX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요 : ");
                    String name = scanner.nextLine();

                    System.out.print("상품의 가격을 입력하세요 : ");
                    int price = scanner.nextInt();

                    System.out.print("구매 수량을 입력하세요 : ");
                    int quantity = scanner.nextInt();

                    total = price * quantity;
                    sum+=total;

                    System.out.println("상품명 : " + name + ", 가격 : " + price + " , 합계 : " + total);
                    break;


                case 2:
                    System.out.println("총 비용 : "+sum);
                    break;

                default:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }

        }
    }
}
