package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue); // 값이 바뀌지는 않는다.

        int z = (int) 10.5;
        System.out.println(z);
    }
}
