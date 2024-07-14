package array.arrayQ;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수 입력하세요 => ");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (i < numbers.length -1 ){
                System.out.print(", ");
            }
        }
    }
}
