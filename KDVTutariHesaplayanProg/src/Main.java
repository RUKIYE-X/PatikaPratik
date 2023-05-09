import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar,kdvliTutar,kdvMiktari;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir tutar giriniz: ");
        tutar = input.nextFloat();
        double kdvOrani = tutar <= 1000 ? 0.18 : 0.08;

        System.out.println("KDV siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOrani);

        kdvliTutar = tutar*kdvOrani + tutar ;
        System.out.println("KDV li tutar: " + kdvliTutar);

        kdvMiktari = kdvliTutar - tutar;
        System.out.println("KDV miktarı: " + kdvMiktari);

        // Girilen tutar miktarına göre kdv li fiyatı ve kdv miktarı hesaplandı.
    }
}