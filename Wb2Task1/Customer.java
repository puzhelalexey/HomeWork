package Wb2Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* Customer class
 */

public class Customer implements Runnable {

    private int id;
    private List<Integer> productIds;
    private static final int TIME_ON_PRODUCT = 1000;

    public Customer(final int id, final int size) {
        this.id = id;
        productIds = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            productIds.add(new Random().nextInt(1000));
        }
    }

    @Override
    public void run() {
        final Thread thread = Thread.currentThread();
        try {
            Thread.sleep(productIds.size(), TIME_ON_PRODUCT);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Cashbox: " + thread.getId() + ",Customer id: " + id + ",products: " + productIds);
    }
}
