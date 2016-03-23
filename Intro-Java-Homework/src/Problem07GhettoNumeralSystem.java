import java.util.Scanner;

public class Problem07GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        char[] result = number.toCharArray();
        String name = "";
        for (int i = 0; i < result.length; i++)
        {
            switch (result[i])
            {
                case '0':
                    name += "Gee";
                    break;
                case '1':
                    name += "Bro";
                    break;
                case '2':
                    name += "Zuz";
                    break;
                case '3':
                    name += "Ma";
                    break;
                case '4':
                    name += "Duh";
                    break;
                case '5':
                    name += "Yo";
                    break;
                case '6':
                    name += "Dis";
                    break;
                case '7':
                    name += "Hood";
                    break;
                case '8':
                    name += "Jam";
                    break;
                case '9':
                    name += "Mack";
                    break;
            }
        }
        System.out.print(name);
    }
}
