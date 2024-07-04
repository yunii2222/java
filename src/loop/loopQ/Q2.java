package loop.loopQ;

public class Q2 {
    public static void main(String[] args) {
        int whileNum = 2;

        while (whileNum <= 20) {
            if (whileNum % 2 == 0) {
                System.out.println( " while문 : " + whileNum);
            }
            whileNum++;
        }

        for (int forNum = 2; forNum <= 20; forNum++) {
            if (forNum % 2 == 0) {
                System.out.println( " for문 : " + forNum);
            }
        }
    }
}
