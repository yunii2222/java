package method.methodQ;

public class Q3 {
    public static void main(String[] args) {
        int balance = 10000;

        // 잔액을 1000원 증가시키고, 업데이트된 잔액을 반환받아 balance에 저장
        balance = deposit(balance, 1000);
        // 잔액에서 2000원을 차감하고, 업데이트된 잔액을 반환받아 balance에 저장
        balance = withdraw(balance,2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    // 입금
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    // 출금
    public static int withdraw(int balance, int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }
}
