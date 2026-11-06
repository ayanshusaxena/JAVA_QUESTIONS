import java.util.*;


public class Position {
    public static void main (String []  args ) {
        int []  arr = { 1, 2, 4, 5};
        int target = 3;
        int left = 0;
        int right = arr.length -1;
        int position = -1;
        while (left<= right ) {
            int mid = (left + right) / 2;
           if (arr[mid] == target) {
            position = mid;
            break;
           } 
            else if (arr[mid] >= target ) {
                 } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Position of target: " + position);

    }
}  


       