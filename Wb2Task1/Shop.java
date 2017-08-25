package Wb2Task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* Shop class
 */

public class Shop {

    private ExecutorService cashBox;

    public Shop(final int cashBoxCount) {
        cashBox = Executors.newFixedThreadPool(cashBoxCount);
    }

    public void sendCustomer(Customer customer) {
        cashBox.submit(customer);
    }

    public void close() {
        cashBox.shutdown();
    }
}

