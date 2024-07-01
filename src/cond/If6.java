package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 50000;
        int age = 10;
        int discount = 0;

        if(price >= 10000){
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
            /* 위에 조건에 만족했기에 아래 코드는 실행이 되지 않는다. */
        } else if ( age >= 10 ){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액 : " + discount + "원");


        /* 실행하는 문장이 한줄이면 가능하다 단, 사용하는것을 권장하지는 않고, {} 사용 권장 */
        if(true) System.out.println("if문에서 실행됨");
    }
}
