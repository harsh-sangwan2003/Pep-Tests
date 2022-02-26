import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class first_missing_positive {

    public static int firstMissingPositive(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0)
                set.add(arr[i]);
        }

        for (int i = 1; i <= arr.length; i++) {

            if (!set.contains(i))
                return i;
        }

        return arr.length + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = firstMissingPositive(arr);
        System.out.println(res);
        scn.close();
    }
}