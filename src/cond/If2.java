package cond;

public class If2 {
    public static void main(String[] args) {
        /* 만약 18살 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다."를 출력해야 한다. */

        int age = 17;

        if (age >= 18) {
            System.out.println("성인입니다.");
        }else {
            System.out.println("미성년자입니다.");
        }
    }
}
