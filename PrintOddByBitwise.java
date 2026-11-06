import java.util.*;

public class PrintOddByBitwise {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if ((number & 1) == 1) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }

        sc.close();

    }
}
