package atm;



 public class Nominal {
    final protected int nominal10 = 10;
    final protected int nominal20 = 20;
    final protected int nominal50 = 50;
    final protected int nominal100 = 100;

    public void listNominals() {
        System.out.println("Доступные номиналы: " + nominal10 + " " + nominal20 + " " + nominal50 + " " + nominal100);
    }

    public boolean noTrans() {
        System.out.println("Операция не удалась");
        listNominals();
        return false;
    }
}
