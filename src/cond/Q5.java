package cond;

public class Q5 {
    public static void main(String[] args) {
        /* 문제: "학점에 따른 성취도 출력하기"
            `String grade` 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은 성취도를 나타낸다.
            "A": "탁월한 성과입니다!"
            "B": "좋은 성과입니다!"
            "C": "준수한 성과입니다!"
            "D": "향상이 필요합니다."
            "F": "불합격입니다."
            나머지: "잘못된 학점입니다." */

        String grade = "A";

        switch (grade){
            case "A" :
                System.out.println("탁월한 성과입니다!");
                break;
            case "B" :
                System.out.println("좋은 성과입니다!");
                break;
            case "C" :
                System.out.println("준수한 성과입니다!");
                break;
            case "D" :
                System.out.println("향상이 필요합니다!");
                break;
            case "F" :
                System.out.println("불합격 입니다!");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
