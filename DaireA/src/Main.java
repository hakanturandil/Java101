import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r;
        double pi, alan, cevre, a;

        System.out.print("Dairenin yarı çapını giriniz :");
        r = input.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz :");
        a = input.nextDouble();
        pi = 3.14;
         // alan = pi*r*r;
        cevre = 2*pi*r;
        alan = (pi*(r*r)*a)/360;

        // System.out.println("Dairenin alanı :" + alan);
        System.out.println("Dairenin çevresi :" + cevre);
        System.out.println("Dairenin alanı :" + alan);

    }
}