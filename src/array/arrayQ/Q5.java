package array.arrayQ;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.print(" 입력받을 숫자의 개수를 입력하세요 => ");
        int count = scanner.nextInt();

        System.out.println( count + "개의 정수 입력하세요 => ");
        int[] numbers = new int[count];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        System.out.println( "점수 총합 : " + total);
        System.out.println( "점수 평균 : " + (double) total / numbers.length);
    }
}