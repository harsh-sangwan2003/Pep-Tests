import java.io.*;
import java.util.*;

public class exitPoint {
    public static Scanner scn = new Scanner(System.in);

    // This is a functional problem.
    // Input is managed for you.
    // Don't change main, write your code in the function below
    public static void main(String[] args) {
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }

        }
        exitPoint(arr);
    }

    public static void exitPoint(int[][] arr) {
        // Write your code only here.

        int dir = 0;
        int r = 0;
        int c = 0;

        while (true) {

            dir = (dir + arr[r][c]) % 4;

            if (dir == 0)
                c++;

            else if (dir == 1)
                r++;

            else if (dir == 2)
                c--;

            else
                r--;

            if (r < 0) {
                r += 1;
                break;
            }

            if (c < 0) {

                c += 1;
                break;
            }

            if (r >= arr.length) {

                r -= 1;
                break;
            }

            if (c >= arr[0].length) {

                c -= 1;
                break;
            }
        }

        System.out.println(r + ", " + c);
    }
}