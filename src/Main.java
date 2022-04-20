import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int ortalama = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = ortalama / 6.0;
        System.out.print("Not ortalamaniz: ");
        System.out.println(sonuc);
        System.out.println(sonuc > 60 ? "Sinifi Gectiniz" : "Sinifta Kaldiniz");
    }
}
