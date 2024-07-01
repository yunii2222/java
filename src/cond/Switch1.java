package cond;

public class Switch1 {
    public static void main(String[] args) {

        /* 당신은 회원 등급에 따라 다른 쿠폰을 발급하는 프로그램을 작성해야 한다.
            이 프로그램은 `int grade` 라는 변수를 사용하며, 회원 등급( `grade` )에 따라 다음의 쿠폰을 발급해야 한다.
            1등급: 쿠폰 1000
            2등급: 쿠폰 2000
            3등급: 쿠폰 3000
            위의 등급이 아닐 경우: 쿠폰 500
            각쿠폰이할당된후에는 `"발급받은 쿠폰 " + 쿠폰값` 을출력해야한다. */
        int grade = 1;

        int coupon;
        if(grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        }else if (grade == 3) {
            coupon = 3000;
        }else {
            coupon = 500;
        }

        System.out.println(" 발급 받은 쿠폰 " + coupon + "원");
    }
}
