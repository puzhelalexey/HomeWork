package Wb2Task1;

import java.util.Random;

/* Application class
 */

public class Application {

    public static void main(String[] args) throws Exception {
        Shop shop = new Shop(10);
        for (int i = 0; i < 100; i++) {
            shop.sendCustomer(new Customer(i, new Random().nextInt(5)));
        }
            Thread.sleep(1000);
            shop.close();
        }
    }

