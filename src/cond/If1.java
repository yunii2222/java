package cond;

public class If1 {
    public static void main(String[] args) {
        /* 만약 18살 이상이면 "성인입니다"를 출력하고, 만약 18살 미만이라면 "미성년자입니다."를 출력해야 한다. */

        int age =17; //사용자 나이

        if(age >= 18){
            System.out.println("성인입니다.");
        }

        if(age < 18){
            System.out.println("미성년자입니다.");
        }
    }
}
