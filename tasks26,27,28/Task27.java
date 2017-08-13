package Tasks_26_27_28;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*To create a collection,populate it with random numbers.
  To remove the duplicate numbers.
*/

public class Task27 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            marks.add(i, (int) (Math.random() * 20));
        }
        System.out.println(marks);

        Set<Integer> set = new HashSet<>();
        set.addAll(marks);

        System.out.println(set);
    }
}
