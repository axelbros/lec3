public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addbalance = 1000;
        int bonus;


        if (addbalance > 1000) {
            bonus = addbalance / 100;
        } else {
            bonus = 0;
        }
        int balancewithbonus = balance + addbalance + bonus;
        System.out.println(balancewithbonus);
    }
}