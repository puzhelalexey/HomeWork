package test;

/*The comparison of speeds of two cycles. One using StringBuilder and method append,
  and the other using addition operator and String*/

public class Task21 {
    public static void main(final String[] args) {
        String str = "1";
        String s = "";
        long t = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 1000; i++) {
            stringBuilder.append(str);
            stringBuilder.toString();
        }
        System.out.println("Use StringBuilder: total time (millisec): " + (System.currentTimeMillis() - t));

        for (int j = 0; j < 1000; j++) {
            s += str;
        }
        System.out.println("Use String: otal time (millisec): " + (System.currentTimeMillis() - t));
    }
}
