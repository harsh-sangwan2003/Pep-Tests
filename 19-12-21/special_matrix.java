import java.util.Scanner;

public class special_matrix {

    public static int isOne(int[] arr) {

        int idx = -1;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                count++;
                idx = i;
            }
        }

        if (count == 1)
            return idx;

        return -1;
    }

    public static void printPositions(int[][] arr) {

        for (int r = 0; r < arr.length; r++) {

            int pcol = isOne(arr[r]);
            int count = 0;

            if (pcol == -1)
                continue;

            for (int row = 0; row < arr.length; row++) {

                if (arr[row][pcol] == 1)
                    count++;
            }

            if (count == 1)
                System.out.println(r + ", " + pcol);
        }
    }

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                mat[i][j] = scn.nextInt();
            }
        }

        printPositions(mat);
        scn.close();
    }
}