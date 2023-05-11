import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// kullanıcının girdiği üs ve taban verilerine göre sayının üssü hesaplanmıştır.
        int base, exponent, total;

        System.out.print("taban sayısını giriniz: ");
        base = input.nextInt();

        System.out.print("üs sayısını giriniz: ");
        exponent = input.nextInt();

        total = 1;
        for (int i = 1; i <= exponent; i++) {
            total = total * base;
        }
        System.out.println("sonuç: " + total);
    }
}