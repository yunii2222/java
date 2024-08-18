package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20, 30));
        

    }
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b ;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a + b + c ;
    }
}
