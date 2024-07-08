package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int의 최고값
        long maxIntOver = 2147483648L; // int의 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println(" maxIntValue casting = " + intValue); // 출력: 2147483647

        // 문제가 될 때
        intValue = (int) maxIntOver; // 형변환
        // 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
        // 오버플로우가 자체가 발생하지 않게 막아야한다.  처음부터 int -> long으로 변경해서 사이즈를 늘린다.
        System.out.println("maxIntOver casting = " + intValue); // 출력: -2147483648
    }
}
