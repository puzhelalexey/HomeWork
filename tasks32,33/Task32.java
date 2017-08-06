package tasks_32_33;

/* Write 20 random numbers to a binary file.
 Read the recorded file, print the numbers and their average arithmetic.
 */

import java.io.*;

public class Task32 {

    public static void main(String[] args) throws IOException {
        DataOutputStream dos;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\work\\pvt\\src\\tasks_32_33\\File.dat")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        for (int i = 0; i < 20; i++) {
            dos.writeInt((int) (Math.random() * 20));
            dos.flush();
        }

        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\work\\pvt\\src\\tasks_32_33\\File.dat")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        int res = dis.readInt();
        int averageArithmetic = 0;
        while (true) {
            System.out.print(res + " ");
            averageArithmetic += res;
            try {
                res = dis.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        if (dis != null) {
            dis.close();
        }
        System.out.println();
        System.out.println("Среднее арифмитическое 20-ти чисел: " + averageArithmetic / 20);
    }
}
