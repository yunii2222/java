package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int
        System.out.println(" div1 = " + div1); // = 1;

        double div2 = 3 / 2; // int /int = 1.0 (자동 형변환)
        System.out.println(" div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5
        System.out.println(" div3 = " + div3);

        double div4 = (double) 3 / 2; // double / int
        System.out.println(" div4 = " + div4); // = 1.5 (double로 자동 형변환)

        int a = 3; // int
        int b = 2; // int
        double result = (double) a / b; // double / int
        System.out.println("result = " + result); // = 1.5 (double로 자동 형변환)
    }
}
