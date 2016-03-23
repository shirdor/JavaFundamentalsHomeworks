import java.util.Scanner;
import java.util.StringJoiner;

public class Problem11GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        String command = scan.nextLine();
        System.out.println(get(numbers, command));
    }
    public static String get(String input, String command) {
        String[] numbers = input.split("\\s+");
        String[] comands = command.split("\\s+");
        String result = "";
        int comandCounter = 0;
        switch (comands[2]){
            case "even":
                for (int i = 0; i < numbers.length ; i++) {
                    if (Integer.parseInt(numbers[i]) % 2 == 0){
                        result += numbers[i] + " ";
                        comandCounter++;
                    }
                    if (comandCounter == Integer.parseInt(comands[1])){
                        break;
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < numbers.length ; i++) {
                    if (Integer.parseInt(numbers[i]) % 2 == 1){
                        result += numbers[i] + " ";
                        comandCounter++;
                    }
                    if (comandCounter == Integer.parseInt(comands[1])){
                        break;
                    }
                }
                break;
        }
        return result;
    }
}
