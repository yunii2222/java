package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        //  1번 방법
//        int[] students; // 배열 변수 선언
//        students = new int[]{90, 70, 60, 40, 80}; // 배열 생성과 초기화
        
        // 2번 방법
//        int[] students = new int[]{90, 70, 60, 40, 80}; // 배열 생성과 초기화

        // 3번 방법
        int[] students = {90, 70, 60, 40, 80}; // 배열 생성과 초기화

        for (int i = 0; i < students.length; i++){
            System.out.println("학생"+ ( i + 1 )+"의 점수" + " : " +  students[i]);
        }
    }
}
