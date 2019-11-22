import java.util.Scanner;

public class JumpingOnTheClouds {

    private static int jumpingOnClouds(int[] m) {
        int temp = 0, zero = 0;
        for (int value : m) {
            if (value == 1) {
                temp += zero / 2 + 1;
                zero = 0;
            } else {
                zero++;
            }
        }
        temp += zero / 2;
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.skip("\n");
        int[] m = new int[n];
        String[] s = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            int mItem = Integer.parseInt(s[i]);
            m[i] = mItem;
        }
        int result = jumpingOnClouds(m);
        System.out.println(result);
    }
}
