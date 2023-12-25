
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* int kisaKenar, uzunKenar, enUzunKenar;
        System.out.print("Kısa Kenar Uzunluğunu Girin :");
        kisaKenar = input.nextInt();
        System.out.print("Uzun Kenar Uzunluğunu Girin :");
        uzunKenar = input.nextInt();
        System.out.print("En Uzun Kenar Uzunluğunu Girin :");
        enUzunKenar = input.nextInt();

        int hipotenus = (kisaKenar*kisaKenar) + (uzunKenar*uzunKenar);
        System.out.println(hipotenus);  */

        /* int a, b;
        double c;
        System.out.print("1. Kenarın Uzunluğunu Girin :");
        a = input.nextInt();
        System.out.print("2. Kenarın Uzunluğunu Girin :");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenusu :"+ c); */

        int a,b,c,u,cevre;
        double alan;

        System.out.print("1. Kenarın Uzunluğunu Girin :");
        a = input.nextInt();
        System.out.print("2. Kenarın Uzunluğunu Girin :");
        b = input.nextInt();
        System.out.print("3. Kenarın Uzunluğunu Girin :");
        c = input.nextInt();

        cevre = (a+b+c);
        u = (a+b+c)/2;
        System.out.println("Çevresi :" + cevre);
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alanı :" + alan);















    }
}