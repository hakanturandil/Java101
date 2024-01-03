import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, newPasword, choose;
        System.out.print("Kulanıcı Adınızı Giriniz :");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else if (!password.equals("java123")) {
            System.out.println("Şifreniz yanlış, Sıfırlamak ister misiniz? (yes / no)");
            choose = input.nextLine();
            if (choose.equals("yes")) {
                System.out.println("Yeni şifrenizi giriniz :");
                newPasword = input.nextLine();
                if (newPasword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                } else {
                    System.out.println("Şifreniz oluşturuldu");
                }
            }
        } else {
            System.out.println("Hatalı ya da eksik işlem yaptınız!");
        }
    }
}