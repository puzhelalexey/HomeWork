package Tasks_26_27_28;

import java.util.ArrayList;
import java.util.List;


/* Create a list of estimates through a ArrayList, to fill in random scores.
To remove an unsatisfactory evaluation.
 */

public class Task26 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println(marks);

        for (int j = 0; j < marks.size(); j++) {
            if (marks.get(j) < 4) {
                marks.remove(marks.get(j));
                j = 0;
            }
        }
        System.out.println(marks);
    }
}
