package loop.loopQ;

public class Q1 {
    public static void main(String[] args) {
        int whileCount = 1;

        while (whileCount <= 10) {
            System.out.println( " while문 : " + whileCount);
            whileCount++;
        }

        for (int forCount = 1; forCount <= 10; forCount++) {
            System.out.println( " for문 : " + forCount);
        }
    }
}
