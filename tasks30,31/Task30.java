package tasks_30_31;

import java.io.*;

/*To create a text file, to read, to count in the text the number of punctuation marks and words.*/

public class Task30 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\work\\pvt\\src\\tasks_30_31\\Text30.txt"));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        str = sb.toString();
         System.out.println(str);
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
        System.out.println("Количество слов в тексте: " + wordCounter);

        int punctuationMarksCounter = 0;
        String s = str.replace("...", ".");
        for (char punctuationMark : s.toCharArray()) {
            if (punctuationMark == ',' || punctuationMark == ';' || punctuationMark == '.') {
                punctuationMarksCounter++;
            }
        }
        System.out.println("Количество знаков препинания в тексте: " + punctuationMarksCounter);
    }
}
