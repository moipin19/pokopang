import java.util.Scanner;

public class RepeatedString {

    private static long repeatedString(String s, long n) {
        long countSubstring = 0;
        long totalCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countSubstring++;
            }
        }
        long divisor = n / s.length();
        totalCount += divisor * countSubstring;
        long remainder = n % s.length();
        for (int i = 0; i < remainder; i ++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        long n = sc.nextLong();

        long result = repeatedString(s,n);
        System.out.println(result);
        sc.close();
    }
}
