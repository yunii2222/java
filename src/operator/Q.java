package operator;

public class Q {
    public static void main(String[] args) {

        /* 1번 문제 */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;

        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

        /* 2번 문제 */
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;

        double sum2 = val1 + val2 + val3;
        double average2 = sum2 / 3;

        System.out.println("sum2 = " + sum2);
        System.out.println("average2 = " + average2);

        /* 3번 문제 */
        int score = 70;
        boolean result = score >= 80 && score <= 100;

        System.out.println("result = " + result);
    }
}
