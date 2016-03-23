import java.util.Scanner;

public class Problem06SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.print("Sum: " + sum);
    }
}
