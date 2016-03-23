import java.util.Scanner;

public class Problem05PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        char theSymbol = 'a';

        for (int i = 1; i <= number ; i++) {
            System.out.print("a ");
            for (int j = 0; j < i - 1; j++) {
                theSymbol++;
                System.out.print(theSymbol + " ");
            }
            System.out.println();
            theSymbol = 'a';
        }
        for (int i = number - 1; i > 0 ; i--) {
            System.out.print("a ");
            for (int j = 0; j < i - 1; j++) {
                theSymbol++;
                System.out.print(theSymbol + " ");
            }
            System.out.println();
            theSymbol = 'a';
        }
    }
}
