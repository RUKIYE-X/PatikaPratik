import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fiz,turk,kmy,trh,muzik;
        Scanner not = new Scanner(System.in);

        System.out.print("matematik notunuzu giriniz: ");
        mat = not.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        fiz = not.nextInt();
        System.out.print("turkçe notunuzu giriniz: ");
        turk = not.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        kmy = not.nextInt();
        System.out.print("tarih notunuzu giriniz: ");
        trh = not.nextInt();
        System.out.print("müzik notunuzu giriniz: ");
        muzik = not.nextInt();

        int toplam = (mat+fiz+turk+kmy+trh+muzik);
        double sonuc = toplam/6;
        System.out.println(sonuc);

        String durum = sonuc>=60 ? "Geçti" : "Kaldı";
        System.out.println(durum);
        /*
        Sınav notlarını giren bir öğrencinin sınıfı geçme kalma
        durumu hesaplanmıştır.
         */
    }
}