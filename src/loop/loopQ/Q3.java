package loop.loopQ;

public class Q3 {
    public static void main(String[] args) {
        int whileSum = 0;
        int max = 4;
        int i = 1;
        int forSum = 0;

        while(i <= max){
            whileSum += i;
            System.out.println("i: " + i + " whileSum : " + whileSum);
            i++;
        }



        for (int j = 1; j <= max; j++){
            forSum += j;
        }
        System.out.println("max: " + max + " forSum : " + forSum);
    }
}
