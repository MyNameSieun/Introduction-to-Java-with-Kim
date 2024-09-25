package _08_array.ex;

public class ArrayEX1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int score = 0;
        for (int student : students) {
            score += student;
        }

        double average = (double) score / students.length;

        System.out.println("점수 총합: " + score);
        System.out.println("점수 평균: " + average);
    }
}
