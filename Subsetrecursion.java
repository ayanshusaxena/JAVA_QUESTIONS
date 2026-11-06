import java.util.ArrayList;

public class Subsetrecursion {
  
    public static void helper(int i, int n, int arr[], ArrayList<Integer> temp) {
        if (i >= n) {
            for (int z : temp) {
                System.out.print(z + " ");
            }
            System.out.println();
            return;
        }

        temp.add(arr[i]);
        helper(i + 1, n, arr, temp);

        temp.remove(temp.size() - 1);
        helper(i + 1, n, arr, temp);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> temp = new ArrayList<>();
        helper(0, arr.length, arr, temp);
    }
}


