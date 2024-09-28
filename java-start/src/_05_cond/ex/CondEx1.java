package _05_cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 95;
        String grade;
        switch (score/10) {
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        System.out.println("출력 : 학점은 " + grade + "입니다.");
    }
}
