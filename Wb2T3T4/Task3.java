package Wb2T3T4;

/*Write a program that searches in the line of all paragraph tags,
 including those that have parameters, for example <p id="p1">,
 and replacing them with simple paragraph tags <p>.
 */

public class Task3 {
    public static void main(String[] args) {
        String s = "<p align=\"left\">Text</p>\n" +
                "<p id=\"p1\" align=\"right\">Text</p>\n" +
                "<p align=\"center\">Text</p>\n" +
                "<p id=\"p2\">Text</p>\n" +
                "<p align=\"justify\">Text</p>";
        System.out.println("Первоначальная строка:");
        System.out.println(s);
        String str2 = s.replaceAll("<p[^>]*>", "<p>");
        System.out.println("Строка после замены:");
        System.out.println(str2);
    }
}
