import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, i = 1, j = 1, ebob = 0, ekok = 0;

        System.out.println("1. sayıyı Giriniz:");
        number1 = input.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        number2 = input.nextInt();

        if (number1 > number2) { // Girilen 1. sayının 2. sayıdan büyük olması isteniyor çünkü ekok değeri bulunurken kısıtlamsı hata verir
            while (i <= number1) {// ebob bulan program parçası
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("Girilen Sayıların Ebob Değeri: " + ebob);

            while (j <= number1 * number2) { // ekok bulan program parçası
                if (j % number1== 0 && j % number2 == 0) {
                    ekok = j;
                    break;
                }
                j++;
            }
            System.out.println("Girilen Sayıların Ekok Değeri: " + ekok);

        } else {
            System.out.println("1. sayıyı 2. sayıdan Büyük Giriniz!!");
        }
    }
}