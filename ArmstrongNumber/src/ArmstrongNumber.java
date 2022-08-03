import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int digitCounter = 0, digitValue, result = 0, digitExp = 1;
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int number = 407, tempNumber = number;


        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCounter++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            digitValue = tempNumber % 10;
            System.out.println(digitValue);
            for (int i = 1; i<=digitCounter; i++) {
                digitExp *= digitValue;
            }
            result += digitExp;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
