import java.util.Scanner;

public class Problem01RectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int area = a * b;
        System.out.printf("The area of rectangle: %d", area);
    }
}
