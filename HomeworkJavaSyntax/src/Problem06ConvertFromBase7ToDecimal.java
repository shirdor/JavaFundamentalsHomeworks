import java.util.Scanner;

public class Problem06ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int numberLenght = Integer.toString(number).length();
        int result = 0;
        for (int i = 0; i < numberLenght; i++)
        {
            result += (number % 10) * Math.pow(7, i);
            number /= 10;
        }
        System.out.print(result);
    }
}
