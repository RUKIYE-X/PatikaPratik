import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, sum;

        System.out.println("Bir sayı Giriniz: ");
        number = input.nextInt();

        sum = 0;
        while (number != 0) {
            sum = number % 10 + sum;
            number /= 10;
        }
        System.out.println("Girilen Sayının rakamlarının toplamı: " + sum);
    }// kullanıcıdan girilen sayının rakamlarının toplaımını bulan progrmam yaptık..
}