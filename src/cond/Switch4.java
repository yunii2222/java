package cond;

public class Switch4 {
    public static void main(String[] args) {
        /* 자바14 새로운 switch문 : 아직 많이 사용하지는 않는다. */

        int grade = 3;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(" 발급 받은 쿠폰 " + coupon + "원");
    }
}
