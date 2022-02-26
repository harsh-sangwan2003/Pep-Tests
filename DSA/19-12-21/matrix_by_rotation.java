import java.util.Scanner;

public class matrix_by_rotation {

    public static boolean equal(int[][] mat1, int[][] mat2) {

        for (int i = 0; i < mat1.length; i++) {

            for (int j = 0; j < mat1[0].length; j++) {

                if (mat1[i][j] != mat2[i][j])
                    return false;
            }
        }

        return true;
    }

    public static void reverse(int[] arr) {

        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {

            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;

            lo++;
            hi--;
        }
    }

    public static void rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] array : arr) {

            reverse(array);
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] mat1 = new int[n1][m1];
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < m1; j++) {

                mat1[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] mat2 = new int[n2][m2];
        for (int i = 0; i < n2; i++) {

            for (int j = 0; j < m2; j++) {

                mat2[i][j] = scn.nextInt();
            }
        }

        if (equal(mat1, mat2)) {
            System.out.println("true");
            System.exit(0);
        }

        rotate(mat1);
        if (equal(mat1, mat2)) {
            System.out.println("true");
            System.exit(0);
        }

        rotate(mat1);
        if (equal(mat1, mat2)) {
            System.out.println("true");
            System.exit(0);
        }

        rotate(mat1);
        if (equal(mat1, mat2)) {
            System.out.println("true");
            System.exit(0);
        }

        System.out.println("false");
        scn.close();
    }
}