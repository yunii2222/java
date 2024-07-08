package scope;

public class Scope3_1 {
    public static void main(String[] args) {
       int m = 10;
       int temp = 0;
       if (m > 0) {
           // m이 조건에 맞으면 2배 증가해서 출력
           // 2배 증가한 값을 저장해두기 위해 임시 변수 temp를 사용
           temp = m * 2;
           System.out.println(" temp " + temp);
       }
        System.out.println(" m = " + m);
    }
}
