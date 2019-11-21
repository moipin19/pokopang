import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder b = new StringBuilder();
        b.append(A);
        b.reverse();
        char[] c = A.toCharArray();
        Arrays.sort(c);
        String d = String.valueOf(c);
        System.out.println("sorted: "+ d);
        if (A.contentEquals(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
