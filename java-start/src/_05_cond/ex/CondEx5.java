package _05_cond.ex;

public class CondEx5 {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("출력 : \"탁월한 성과입니다!\"");
                break;
            case "B":
                System.out.println("출력 : \"좋은 성과입니다!\"");
                break;
            case "C":
                System.out.println("출력 : \"준수한 성과입니다!\"");
                break;
            case "D":
                System.out.println("출력 : \"향상이 필요합니다.\"");
                break;
            case "F":
                System.out.println("출력 : \"불합격입니다.\"");
                break;
            default:
                System.out.println("출력 : \"잘못된 학점입니다.\"");
        }
    }
}
