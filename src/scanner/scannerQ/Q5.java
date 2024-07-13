package scanner.scannerQ;

public class Q5 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int temp;

        System.out.println(" 변경전 a = " + a);
        System.out.println(" 변경전 b = " + b);

        // a를 temp에 먼저 보관해둔다.
        temp = a;

        // a에 b에 있던 10을 담는다.
        a = b;

        // b에 이제 temp에 담겨있던 20을 담는다.
        b = temp;

        System.out.println(" 변경후 a = " + a);
        System.out.println(" 변경후 b = " + b);

    }
}
