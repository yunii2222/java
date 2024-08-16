package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        // 홀수
        if (i % 2 == 1){
            // 수행하다가 return문을 만나면 그 즉시 해당 메서드를 빠져나간다.
            return true;
        }else {
            return false;
        }
    }
}
