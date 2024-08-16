package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println(" ~ 프로그램이 동작합니다 ~");
        printFooter();

    }

    // 반환할게 없다면 void
    // 매개변수도 없고 반환타입도 없다.
    public static void printHeader(){
        System.out.println(" = 프로그램을 시작합니다 = ");
    }

    public static void printFooter(){
        System.out.println( " = 프로그램을 종료합니다 = ");
    }
}
