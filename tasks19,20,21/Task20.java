package test;

/*The output text from the last letters of all words.*/

public class Task20 {
    public static void main(final String... args) {
        final String line = "  Introduction Text:  linguistic realization of propositional meanings.   ";
        String sn = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                sn += line.charAt(i);
            } else {
                if (!sn.equals("")) {
                    System.out.print((sn.charAt(sn.length() - 1)));
                    sn = "";
                }
            }
        }
        if (!sn.equals("")) {
            System.out.print((sn.charAt(sn.length() - 1)));
        }
    }
}
