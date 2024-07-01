package cond;

public class Switch3 {
    public static void main(String[] args) {
        /* 비즈니스 요구사항이 변경되었다. **2등급도 3등급과 같이 3000원 쿠폰을 준다**고 해보자. */
        int grade = 3;

        int coupon;

        switch (grade){
            case 1 :
                coupon = 1000;
                break;
            case 2 :
            case 3 :
                coupon = 3000;
                break;
                /* else같은 느낌 */
            default: coupon = 500;
        }

        System.out.println( "발급 받은 쿠폰 " + coupon + "원");
    }
}
