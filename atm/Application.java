package atm;



public class Application {
    public static void main(String... args) {
        ATM atm = new ATM(40, 30, 20, 10);
        atm.putMoney(5);
        boolean trans = atm.takeMoney(1360);
        System.out.println("Транзакция: " + trans);
    }
}
