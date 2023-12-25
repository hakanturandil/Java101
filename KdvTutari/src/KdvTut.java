
import java.util.Scanner;
public class KdvTut {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        /* kdv tutarı : %18

        System.out.print("Ürün fiyatını giriniz :");
        double urun = input.nextDouble();
        System.out.println("KDV\'siz fiyat :" + urun);

        double inKdv = urun*18/100 + urun;
        System.out.println("KDV\'li fiyat :" + inKdv);

        double oranKdv = urun*18/100;
        System.out.println("KDV tutarı :" + oranKdv);   */

        double tutar, kdvOran, kdvOran2, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();


        kdvOran = 0.18;
        kdvOran2 = 0.08;

        boolean tutarA = tutar > 1000;
        double kosul = tutarA ? kdvOran2 : kdvOran;
        System.out.println(kosul);

        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;
        System.out.println("KDV'siz tutar :" + tutar);
        /* System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV 1000den Büyük Oranı :" + kdvOran2); */
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutar :" + kdvliTutar);



    }



}
