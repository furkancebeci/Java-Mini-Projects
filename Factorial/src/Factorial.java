import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to find the factorial of: ");
        int num = input.nextInt();
        int result = 1;

        for (int i=1; i<=num; i++) {
            result *= i;
        }
        System.out.println(num + "! = " + result);
    }
}
