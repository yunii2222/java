package method.methodQ;

public class Q2Ref {
    public static void main(String[] args) {
        printMessage("hi~", 5);
        printMessage("hello~", 3);
    }
    public static void printMessage(String message, int times){
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
    }
}
