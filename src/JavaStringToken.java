import java.util.*;

public class JavaStringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] q = s.trim().split("[\\p{Punct}\\p{Blank}]+, 0");
        if (q.length == 1 && q[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(q.length);
            for (String i : q) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
