package Wb2T3T4;

/*Write the code that displays the number 153.5 in monetary form for Ukraine.
 */

import java.text.NumberFormat;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        final double number = 153.5;
        Locale loc = new Locale("uk", "UA");
        NumberFormat hrnFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(hrnFormat.format(number));
    }
}
