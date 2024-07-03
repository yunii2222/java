package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // 1. 일단 실행한 뒤 (최초 한번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다.)
        // 3. 다시 실행된다.
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
            // 2. 조건문을 만나고 true면
            // 4. 거짓이라면 종료 된다.
        } while ( i < 3);
    }
}
