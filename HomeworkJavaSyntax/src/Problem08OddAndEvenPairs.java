import java.util.Scanner;

public class Problem08OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] numbers = input.split("\\s+");
        if (numbers.length % 2 == 0){
            for (int i = 0; i < numbers.length - 1; i++) {
                if (Integer.parseInt(numbers[i]) % 2 == 0 && Integer.parseInt(numbers[i + 1]) % 2 == 0){
                    System.out.printf("%s, %s -> both are even\n", numbers[i], numbers[i + 1]);
                    i++;
                }
                else if (Integer.parseInt(numbers[i]) % 2 == 1 && Integer.parseInt(numbers[i + 1]) % 2 == 1){
                    System.out.printf("%s, %s -> both are odd\n", numbers[i], numbers[i + 1]);
                    i++;
                }
                else {
                    System.out.printf("%s, %s -> different\n", numbers[i], numbers[i + 1]);
                    i++;
                }
            }
        }
        else {
            System.out.println("Invalid length");
        }
    }
}
