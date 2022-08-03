import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double total = 10, ratio = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Yol Mesafisini Giriniz (km): ");
        km = input.nextInt();

        total += (km * ratio);
        System.out.println("Tutar = " + (total >= 20 ? total : 20));
    }
}
