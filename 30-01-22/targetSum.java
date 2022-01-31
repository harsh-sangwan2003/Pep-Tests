import java.io.*;
import java.util.*;

public class targetSum {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int temp = target - arr[i];
            int start = i + 1;
            int end = n - 1;
            while (start < end) {
                if (arr[start] + arr[end] > temp)
                    end--;
                else if (arr[start] + arr[end] < temp)
                    start++;
                else {
                    System.out.println(arr[i] + ", " + arr[start] + " and " + arr[end]);
                    start++;
                    end--;
                }
            }
        }
    }
}