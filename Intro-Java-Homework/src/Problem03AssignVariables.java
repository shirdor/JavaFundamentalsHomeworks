//public class Problem03AssignVariables {
//    public static void main(String[] args) {
//        boolean firstVariable = false;
//        String secondVariable = "Palo Alto, CA";
//        short thirdVariable = 32767;
//        int fourthVariable = 2000000000;
//        double fifthVariable = 0.1234567891011;
//        float sixthVariable = 0.5f;
//        long seventhVariable = 919827112351L;
//        byte eighthVariable = 127;
//        char ninthVariabl = 'c';
//        //short exceededShort = 32768; // При надвишаване на типа ни показва в кой тип слагаме променливата и типа който е тя.
//                                       // Също така ни се подчертава в червено. Коментирал съм реда за да не ми дава проблем.
//    }
//}

import java.util.Scanner;
public class Problem03AssignVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer number: ");
        int inputNumber = input.nextInt();

        for (int i = 1; i <= inputNumber; i++) {
            for (char c = 'a'; c < 'a' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        for (int i = inputNumber - 1; i >= 1; i--) {
            for (char c = 'a'; c < 'a' + i; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}