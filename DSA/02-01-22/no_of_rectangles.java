import java.util.*;

public class no_of_rectangles {
    public static int countGoodRectangles(int[][] rectangles) {
        // write your code here..

        int[] arr = new int[rectangles.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rectangles.length; i++) {

            int min = Math.min(rectangles[i][0], rectangles[i][1]);

            arr[i] = min;
            if (map.containsKey(arr[i])) {

                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {

                map.put(arr[i], 1);
            }
        }

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {

                ans = Math.max(ans, map.get(arr[i]));
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }

        int ans = countGoodRectangles(arr);
        System.out.println(ans);

        scn.close();
    }
}