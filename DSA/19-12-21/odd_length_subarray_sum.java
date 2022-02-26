import java.util.Scanner;

public class odd_length_subarray_sum {

    public static int sumOddLengthSubarrays(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            int count = 0;

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];
                count++;

                if (count % 2 != 0)
                    ans += sum;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(sumOddLengthSubarrays(arr));
        scn.close();
    }
}