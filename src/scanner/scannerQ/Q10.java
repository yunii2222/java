package scanner.scannerQ;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

    while (true) {
        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
        System.out.print(" => ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print(" 상품명을 입력하세요 => ");
            String productName = scanner.next();

            System.out.print(" 상품의 가격을 입력하세요 => ");
            int price = scanner.nextInt();

            System.out.print(" 구매 수량을 입력하세요 => ");
            int quantity = scanner.nextInt();

            totalCost += price * quantity;
            System.out.println(" 상품명 : " + productName + " 가격: " + price + " 수량: " + quantity + " 합계: " + price * quantity);

            } else if (option == 2) {

                System.out.println(" 총 비용 => " + totalCost );
                // 총 비용 초기화
                totalCost = 0;

            } else if (option == 3) {
                System.out.print("프로그램 종료");
                break;

            }else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
