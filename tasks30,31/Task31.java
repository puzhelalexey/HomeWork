package tasks_30_31;

/* There is a text file which contains numbers. Find all the numbers, print it, calculate the sum,
 remove all the duplicate numbers and print again.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task31 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\work\\pvt\\src\\tasks_30_31\\Text31.txt"));
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        String str;
        int sum = 0;
        int sum2 = 0;
        while ((str = br.readLine()) != null) {
            sb.append(str).append("\n");
        }
        str = sb.toString();
        String s = str.replaceAll("[,.]", "");
        String[] elements = s.split(" ");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].matches("[0-9]+")) {
                System.out.print(elements[i] + " ");
                set.add(Integer.parseInt(elements[i]));
                sum += Integer.parseInt(elements[i]);
            }
        }
        System.out.println();
        System.out.println("Cумма чисел равна: " + sum);
        System.out.print("Числа после удаления повторяющихся чисел: ");
        for (int elementSet : set) {
            System.out.print(elementSet + " ");
            sum2 += elementSet;
        }
        System.out.println();
        System.out.println("Cумма чисел равна: " + sum2);
    }
}
