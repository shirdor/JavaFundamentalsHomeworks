import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problem07RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int finish = scan.nextInt();
        Random rand = new Random();
        int numberAtTheMoment = rand.nextInt();
        int numbersCount = Math.max(start, finish) - Math.min(start, finish);
        ArrayList<Integer> allNumbers = new ArrayList<>();
        for (int i = 0; i <= numbersCount; i++) {
            if ((numberAtTheMoment >= Math.min(start, finish) && numberAtTheMoment <= Math.max(start, finish)) && !allNumbers.contains(numberAtTheMoment)){
                System.out.print(numberAtTheMoment + " ");
                allNumbers.add(numberAtTheMoment);
            }
            else {
                numbersCount++;
            }
            numberAtTheMoment = rand.nextInt((Math.max(start, finish) - Math.min(start, finish)) + 1) + Math.min(start, finish);
        }
    }
}
