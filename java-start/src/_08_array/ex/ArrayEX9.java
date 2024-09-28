package _08_array.ex;

import javax.swing.*;
import java.util.Scanner;

public class ArrayEX9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int maxProduct=10;
        String[] productNames=new String[maxProduct];
        int[]prouctPrices=new int[maxProduct];
        int productCounter=0;

        while (true){
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");

            int menu=scanner.nextInt();
            scanner.nextLine();


            if(menu==1){
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCounter]=scanner.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                prouctPrices[productCounter]=scanner.nextInt();

                productCounter++;
            }

            if(menu==2){
                // 상품을 더 등록할 수 없는 경우
                if(productCounter>maxProduct){
                    System.out.println("더 이상 등록할 수 없습니다.");
                }

                // 등록된 상품이 없는 경우
                else if(productCounter==0){
                    System.out.println("등록된 상품이 없습니다.");
                }

                for(int i=0;i<productCounter;i++){
                    System.out.println(productNames[i] +":"+prouctPrices[i]+"원");
                }
            }

            else if(menu==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("잘못된 메뉴를 입력하셨습니다.");
            }




        }

    }
}
