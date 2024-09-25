package _05_cond.ex;

public class CondEx2 {
    public static void main(String[] args) {
        int distance = 3;
        String transportation;

        if (distance <= 1) {
            transportation = "도보";
        } else if (distance <= 10) {
            transportation = "자전거";
        } else if (distance <= 100) {
            transportation = "자동차";
        } else {
            transportation = "비행기";
        }
        System.out.println("출력 : " + transportation + "를 이용하세요.");
    }
}
