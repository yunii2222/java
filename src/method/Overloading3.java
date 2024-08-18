package method;

public class Overloading3 {

    /* 본인 타입에 가장 적갑한 메서드를 먼저 호출(실행)하고,
     * 없으면 자동 형변환을 할 수 있는 메서드를 찾아서 호출(실행)한다.*/
    public static void main(String[] args) {
        System.out.println("1번:" + add(10,10));
        System.out.println("2번:" + add(2.0, 2.0));
    }
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }

}
