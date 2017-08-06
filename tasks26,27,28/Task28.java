package Tasks_26_27_28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Create a list of marks through a ArrayList, to fill in random scores.
 To find the highest mark using the iterator.
  */


public class Task28 {
    public static void main(String[] args) {
        int maxMark = 0;
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println(marks);

        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (maxMark < value) {
                maxMark = value;
            }
        }
        System.out.println(maxMark);
    }
}
