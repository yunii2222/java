package array.arrayQ;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요 => ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 출력
        System.out.print("입력한 정수를 역순으로 출력 => ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);

            // 0 보다 클때마다 뒤에 ,를 붙인다.
            // 4,3,2,1
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
