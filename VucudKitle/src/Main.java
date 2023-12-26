import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, kitleIndeks;
        System.out.print("Boyunuzu metre şeklinde giriniz :");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kilogram şeklinde Giriniz :");
        kilo = input.nextDouble();

        kitleIndeks = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :" + kitleIndeks);




    }
}