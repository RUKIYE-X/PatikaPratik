import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, a;
        double pi = 3.14,alan;
        System.out.print("yarıçapı giriniz: ");
        r = input.nextInt();
        System.out.print("merkez açıyı giriniz: ");
        a = input.nextInt();

        alan = (pi * (r*r) * a) / 360;
        System.out.println("dairenin alanı: " + alan);
// yarıçapı ve merkez açısı kullanıcıdan alınan dairenin alanı.

    }
}