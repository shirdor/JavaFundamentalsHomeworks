import java.util.Scanner;

public class Problem09HitTheTarget {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int theTarget = scan.nextInt();
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == theTarget){
                    System.out.printf("%d + %d = %d\n", i, j, theTarget);
                }
            }
        }
        for (int i = theTarget + 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == theTarget){
                    System.out.printf("%d - %d = %d\n", i, j, theTarget);
                }
            }
        }
    }
}
