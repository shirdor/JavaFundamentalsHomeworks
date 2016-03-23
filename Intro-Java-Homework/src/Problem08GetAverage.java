import java.util.Scanner;

public class Problem08GetAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNumber = scan.nextDouble();
        double secondNumber = scan.nextDouble();
        double thirdNumber = scan.nextDouble();
        System.out.printf("The average is:  %.2f ", avarage(firstNumber, secondNumber, thirdNumber));
    }
    public static double avarage (double firstNum, double secondNum, double thirdNum){
        double average = (firstNum + secondNum + thirdNum) / 3;
        return average;

    }

}
