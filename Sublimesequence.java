import java.util.*;

public class SublimeSequence  {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
        int x = sc.nextInt();
               int n = sc.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    sum += x;
                } else {
                    sum -= x;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
