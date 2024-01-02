import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, sellect;
        System.out.print("İlk sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlemi seçiniz :");
        sellect = input.nextInt();

        /* if (sellect == 1){
            System.out.println("Toplamı :" + (n1 + n2));
        } else if (sellect == 2) {
            System.out.println("Çıkarması :" + (n1 - n2));
        } else if (sellect == 3) {
            System.out.println("Çarpması :" + (n1 * n2));
        } else if (sellect == 4) {
            if (n2 != 0){
                System.out.println("Bölmesi :" + (n1 / n2));
            } else {
                System.out.println("Bir sayıyı 0'a bölemezsiniz!");
            }

        } else {
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        } */
        switch (sellect){
            case 1 :
                System.out.println("Toplamı :" + (n1 + n2));
                break;
            case 2 :
                System.out.println("Çıkarması :" + (n1 - n2));
                break;
            case 3 :
                System.out.println("Çarpması :" + (n1 * n2));
                break;
            case 4 :
                if (n2 != 0){
                    System.out.println("Bölmesi :" + (n1 / n2));
                } else {
                    System.out.println("Bir sayıyı sıfıra bölemezsin!");
                }
                break;
            default :
                System.out.println("Yanlış seçim yaptınız. Tekrar Deneyiniz.");
                break;
        }

    }
}