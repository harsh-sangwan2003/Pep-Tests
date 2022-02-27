import java.util.Scanner;

public class grandfather_car {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int t = scn.nextInt();
        int k = scn.nextInt();

        sol(n, t, k);
        System.out.println(distance - 1);

        scn.close();
    }

    public static int distance = 0;

    public static void sol(int n, int t, int k) {

        if (n <= 0)
            return;

        if (distance % k != 0) {
            distance++;
            sol(n - t, t, k);
        }

        else {
            distance++;
            sol(n - t + 1, t, k);
        }
    }
}