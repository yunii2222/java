package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 배열 생성

        // 변수 값 대입
        students[0] = 90; // 배열은 0부터 시작
        students[1] = 70;
        students[2] = 60;
        students[3] = 40;
        students[4] = 80;

        for (int i = 0; i < students.length; i++){
            System.out.println("학생"+ ( i + 1 )+"의 점수" + " : " +  students[i]);
        }
    }
}
