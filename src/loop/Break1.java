package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;


        while (true){
            sum = sum + i; // sum = 1+2+3+4+5
            // 만약에 sum이 10보다 크면 종료
            if ( sum > 10 ){
                System.out.println(" sum의 합이 10보다 크면 종료 : i = " + i + " sum = " + sum );
                // break가 없다면 빠져나올 수 없다.
                break;
            }
            i++;
        }
    }
}
