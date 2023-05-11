import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        double result = 0.0;
        
        for (double i = 1; i <= number; i++) {
            result += 1 / i;
        }
        System.out.println(result);
    }// kullanıcıdan girilen sayının harmonik hesaplaması yapıldı
}