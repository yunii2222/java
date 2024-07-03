package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1; // <- 변수 i의 값만 변경하면 나머지 코드를 변경하지 않아도 된다.

        sum = sum + i;
        System.out.println(" i = " + i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println(" i = " + i + " sum = " + sum);
        i++;

        sum = sum + i;
        System.out.println(" i = " + i + " sum = " + sum);
    }
}
