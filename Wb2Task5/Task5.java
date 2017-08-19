package Wb2Task5;

/*Create a program that can greet the user in three languages: English, Russian, Belarusian.
 The required language and country must be reported to the program as input parameters.
 If the input parameters are not available, the program should output the message in English.
 */

import java.util.Locale;
import java.util.ResourceBundle;

public class Task5 {
    public static void main(String[] args) {
        String language = "en";
        String country = "EN";
        try {
            if (!args[0].isEmpty() && !args[1].isEmpty()) {
                language = args[0];
                country = args[1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Входные параметры отсутствуют");
        }
        Locale loc = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", loc);
        System.out.println(rb.getString("greetings"));
    }
}
