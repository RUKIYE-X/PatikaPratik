import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, passw;

        System.out.print("Kullanici adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        passw = input.nextLine();

        if (userName.equals("patika") && passw.equals("java123")) {
            System.out.println("Giriş Başarili");
        } else {
            System.out.println("şifre hatalı sıfırlamak istiyormusunuz? \nevet - hayır");
            String output = input.nextLine();// sıfırlamak istiyorsa veya istemiyorsa cevap verir.

            if (output.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String passw2 = input.nextLine();

                if (passw.equals(passw2) || passw2.equals("java123")) { // önceki şifre ile aynı olup olmadığını kontrol eder
                    System.out.println("Girdinizi şifre yanlış yeniden deneyiniz: ");

                } else {
                    System.out.println("Şifre oluşturma başarılı!");
                }
            } else {
                System.out.println("yeni şifre oluşturulmadı!");
            }
        }
        //kullanıcıdan alınan userName ve passw ile karşılaştırma yapıldı
        //eğer şifre hatalı ise şifresinin sıfırlanmasını sorduk eğer sıfırlanmasını istiyorsa
        // yeni şifre girip sıfırlandığını istemiyorsa şifrenin oluşturulmadığı uyarısını verdik.
    }
}