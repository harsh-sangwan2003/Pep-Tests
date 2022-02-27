import java.util.Scanner;

public class first_missing_positive_2 {

    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] <= 0)
                arr[i] = n + 2;
        }

        for (int i = 0; i < n; i++) {

            int curr = Math.abs(arr[i]) - 1;

            if (curr < n) {

                if (arr[curr] > 0)
                    arr[curr] = (arr[curr]) * -1;
            }
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0)
                return i + 1;
        }

        return n + 1;
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