import java.util.Scanner;
import java.lang.String;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstInput = scan.next();
        String secondInput = scan.next();
        System.out.println(characterMultiplier(firstInput, secondInput));
    }
    public static int characterMultiplier(String firstString, String secondString) {
        int sum = 0;
        for (int i = 0; i < Math.min(firstString.length(), secondString.length()); i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }
        if (firstString.length() > secondString.length()) {
            String extraString = firstString.substring(secondString.length());
            for (int i = 0; i < extraString.length(); i++) {
                sum += extraString.charAt(i);
            }
        }
        if (firstString.length() < secondString.length()) {
            String extraString = secondString.substring(firstString.length());
            for (int i = 0; i < extraString.length(); i++) {
                sum += extraString.charAt(i);
            }
        }
        return sum;
    }
}
