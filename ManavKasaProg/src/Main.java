import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, armut, elma, domates, muz, patlican, toplamTutar;
        System.out.print("Kaç kilo aldınız? :");
        kilo = input.nextDouble();

        armut = 2.17*kilo;
        elma = 3.67*kilo;
        domates = 1.11*kilo;
        muz = 0.95*kilo;
        patlican = 5.00*kilo;

        toplamTutar = armut+elma+domates+muz+patlican;
        System.out.println("Armut :" + kilo + "=" +armut);
        System.out.println("Elma :" + kilo + "=" +elma);
        System.out.println("Domates :" + kilo + "=" +domates);
        System.out.println("Muz :" + kilo + "=" +muz);
        System.out.println("Patlıcan :" + kilo + "=" +patlican);



        System.out.println("Toplam Tutar :" + toplamTutar + "TL");


    }
}