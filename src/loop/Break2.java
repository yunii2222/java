package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        // for문은 조건식이 없으면 무한반복한다.
        for (; ;){
            sum = sum + i; // sum += i;
            // sum이 10보다 크면 break로 for문을 빠져나간다.
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i = " + i + " sum = " + sum );
                break;
            }
            i++;
        }
    }
}
