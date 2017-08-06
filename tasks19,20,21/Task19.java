package test;

/*Counting words in text.*/

public class Task19 {
    public static void main(final String... args) {
        final String s = "  Introduction Text:  linguistic realization of propositional meanings. ";
        String str = s.trim();
        int wordCounter = 0;
        String sn = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                sn += str.charAt(i);
            } else {
                if (!sn.equals("")) {
                    sn = "";
                    wordCounter++;
                }
            }
        }
        if (!sn.equals(""))
            wordCounter++;
        System.out.println("result= " + wordCounter);
    }
}
