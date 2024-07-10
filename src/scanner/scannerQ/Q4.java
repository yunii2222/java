package scanner.scannerQ;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요 => ");
        int gugudan = scanner.nextInt();

        System.out.println(gugudan + "의 구구단");

        for(int i = 1; i <= 9; i++) {
            System.out.println(gugudan + " x " + i + " = " + gugudan * i);
        }
    }
}
