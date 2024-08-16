package array.arrayQ;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("5개의 정수 입력하세요 => ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.println( " 점수 총합 : " + total);
        System.out.println( " 점수 평균 : " + (double) total / numbers.length);
    }
}
