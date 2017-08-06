package atm;


public class ATM extends Nominal {
    private int banknote10;
    private int banknote20;
    private int banknote50;
    private int banknote100;

    private int sumOfATM;

    public ATM(final int banknote10, final int banknote20, final int banknote50, final int banknote100) {
        if (banknote10 >= 0 && banknote20 >= 0 && banknote50 >= 0 && banknote100 >= 0) {
            this.banknote10 = banknote10;
            this.banknote20 = banknote20;
            this.banknote50 = banknote50;
            this.banknote100 = banknote100;
            sumOfATM = banknote10*10 + banknote20 *20 + banknote50 * 50 + banknote100 * 100;
        }
    }

    public void putMoney(final int cash) {
        if (cash > 0) {
            banknote20 += cash;
            banknote50 += cash;
            banknote100 += cash;
        }
    }

    public boolean takeMoney(final int sum) {

        if (sum < nominal20) {
            noTrans();
        }

        if (sum >= nominal20) {
            if (sum > sumOfATM || sum % 100 == 30 || sum % 10 != 0 || sum % 100 < nominal20) {
                noTrans();
            } else {
                System.out.println("Расклад выданной суммы денег:");
                System.out.println(sum / 100 + " купюр(а,ы) номиналом " + nominal100);
                System.out.println(sum % 100 / 50 + " купюр(а,ы) номиналом " + nominal50);
                System.out.println(sum % 100 % 50 / 20 + " купюр(а,ы) номиналом " + nominal20);
                System.out.println(sum % 100 % 50 % 20 / 10 + " купюр(а,ы) номиналом " + nominal10);
                return true;
            }
        }
        return false;
    }
}
