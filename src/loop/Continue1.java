package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // i = 1, 2, 3
        while (i <= 5) {
            // i = 3일 때
            if (i == 3) {
                // i 를 1증가 시키고
                i++;
                // 무시되어서 3은 출력이 안된다. 그리고 다시 while문으로
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
