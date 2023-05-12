import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 3700;
        int right = 3, select, money;
        String userName, passw;

        while (right > 0) { // kullanıcının giriiş sayısını kontrol eder
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Sifrenizi Giriniz: ");
            passw = input.nextLine();
            if (userName.equals("patika") && passw.equals("dev123")) {// kullanıcı adı ve şifre kontrolü yapar.
                System.out.println("Başarılı Giriş Yaptınız..");
                do {
                    System.out.println("1-para yatırma\n2-para çekme\n3-bakiye sorgulama\n4-çıkış");
                    System.out.println("Yapmak Istediğiniz Işlemi Seçiniz: ");
                    select = input.nextInt();
                    switch (select) { // seçilen ifadeye göre işlem gerçekleştirilir.
                        case 1:
                            System.out.println("Para Miktarı Giriniz:");
                            money = input.nextInt();
                            balance += money;
                            break;
                        case 2:
                            System.out.println("Para Miktarı Giriniz:");
                            money = input.nextInt();
                            if (money > balance) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                balance -= money;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" + balance);
                            break;
                    }

                } while (select != 4);
                System.out.println("Çıkış Yapılıyor...");
                break;
            } else {
                right--;
                System.out.println("Yanlış Şifre Tekrar Deneyiniz!");
                if (right == 0) { //giriş hakkı kalmadığında hesap bloke olur.
                    System.out.println("Hesabınız Bloke Olmuştur");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }

        }
    }
}