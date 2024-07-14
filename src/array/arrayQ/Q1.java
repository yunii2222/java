package array.arrayQ;

public class Q1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;

       for (int i = 0; i < students.length; i++) {
           total += students[i];
       }
        System.out.println( " 점수 총합 : " + total);
        System.out.println( " 점수 평균 : " + (double) total / students.length);
    }
}
