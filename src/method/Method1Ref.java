package method;

public class Method1Ref {
    // 메서드는 함수의 한 종류이다.
    public static void main(String[] args) {
        /* 1. 메서드 호출 */
        // 계산1
        int sum1 = add(10, 5);
        System.out.println("결과1 출력 = " + sum1);

        System.out.println("====================================");

        // 계산 2
        int sum2 = add(20, 5);
        System.out.println("결과2 출력 = " + sum2);

    }

    /* 2. 파라미터 변수들이 전달 되면서 메서드가 수행된다. */
    // add 메서드
    // int add = 어떤형을 반환하겠느냐? int숫자형으로 반환하겠다.
    // (int a, int b) 매개변수<파라미터>
    public static int add(int a, int b){
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }

}
