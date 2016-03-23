import java.util.Scanner;

public class Problem04CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double firstFormulaResult = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), (a + b + c) / Math.sqrt(c));
        double secondFormulaResult = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), a - b);
        double firstAvarage = (a + b + c) / 3;
        double secondAvarage = (firstFormulaResult + secondFormulaResult) / 2;
        double difference = firstAvarage - secondAvarage;
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstFormulaResult, secondFormulaResult, Math.abs(difference));
    }
}
