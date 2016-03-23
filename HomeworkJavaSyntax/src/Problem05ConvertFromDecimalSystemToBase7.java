import java.lang.invoke.LambdaConversionException;
import java.util.Scanner;

public class Problem05ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deccimalNumber = scan.nextInt();
        int newNumber = deccimalNumber;
        int extra = 0;
        String result = "";
        String baseSevenNumber = "";
        do
        {
            extra = newNumber % 7;
            baseSevenNumber += Integer.toString(extra);
            newNumber /= 7;
        } while (newNumber != 0);
        result = new StringBuffer(baseSevenNumber).reverse().toString();
        System.out.print(result);
    }
}
