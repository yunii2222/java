package scope;

public class Scope3_2 {
    public static void main(String[] args) {
       int m = 10;
       if (m > 0) {
           // temp를 if 내부에 선언하면 메모리를 더 효율적으로 사용할 수 있고,
           // temp를 생각해야하는 범위가 줄어든다.
           int temp = m * 2;
           System.out.println(" temp = " + temp);
       }
       // System.out.println(" temp = " + temp);
        System.out.println(" m = " + m);
    }
}
