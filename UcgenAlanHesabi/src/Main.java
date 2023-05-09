import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,alan,u,cevre;
        Scanner sayi = new Scanner(System.in);
        System.out.print("1. kenar uzunluğu giriniz: ");
        a = sayi.nextInt();
        System.out.print("2. kenar uzunluğu giriniz: ");
        b = sayi.nextInt();
        System.out.print("3. kenar uzunluğu giriniz: ");
        c = sayi.nextInt();

        u = (a+b+c)/2;
        cevre = 2*u;
        alan = (int)Math.sqrt(u*(u-a)*(u-b)*(u-c));// sqrt metodu sayının karekökünü alır
        System.out.println("üçgenin alanı: " + alan);
        System.out.println("üçgenin cevresi: " + cevre);
        // kullanıcıdan alınan kenar uzunluğuna göre üçgenin alanı ve çevresi hesaplandı.
    }
}