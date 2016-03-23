import java.util.Scanner;

public class Problem03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", Integer.toHexString(a).toUpperCase(), String.format("%10s",Integer.toBinaryString(a)).replace(" ", "0"), b, c);
    }
}
