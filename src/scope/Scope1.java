package scope;

public class Scope1 {
    public static void main(String[] args) {
        // scope(범위)란? => 변수의 접근 가능한 범위
        int m = 10; // m 생존 시작
        if (true){
            // x if문 안에 생존 시작
            int x = 20;
            System.out.println(" if m = " + m ); // 블록 내부에서 블록 외부는 접근 가능
            System.out.println(" if x = " + x );
        } // x 생존 종료

         // System.out.println( " main x = " + x); 오류, 변수 x에 접근 불가
        System.out.println( " main m = " + m);
        // m 생존 종료 (main 메서드가 끝날 때 까지)
    }
}
