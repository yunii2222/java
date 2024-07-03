package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // -> 1부터 시작
        int endNum = 3;

        // i = 2, endNum = 3
        // i 가 endNum이 될 때 까지 코드 블럭을 실행한다.
        while ( i <= endNum ) {
            sum = sum + i;
            System.out.println(" i = " + i + " sum = " + sum);
            // i가 endNum보다 커지게 되면 while문을 빠져나와 종료하게 된다.
            i++;
        }
    }
}
