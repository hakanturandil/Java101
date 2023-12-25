
import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin :");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu girin :");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Girin :");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Girin :");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Girin :");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Girin :");
        muzik = input.nextInt();

        double ortalama = ((mat+fizik+kimya+turkce+tarih+muzik) / 6.0);

        System.out.println(ortalama);

        double a = 60.0;
        boolean gecti = ortalama >= a;

        String kosul = gecti ? "Sınıfı Geçti." : "Sınıfta Kaldı.";

        System.out.println(kosul);














    }
}
