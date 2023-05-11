import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum = 0,counter = 0,avg;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı Giriniz: ");
        number = input.nextInt();

        for (int i=1;i<=number;i++){
            if(i % 12 == 0){
                sum = sum+i;// 12 ye tam bölünen sayıların toplamını tutar.
                counter = counter + 1; // kaç tane sayının tam bölündüğünü tutar.
            }
        }
        avg = sum/counter;
        System.out.println("4 ve 3 'e bölünebilen sayıların toplamı: " + sum);
        System.out.println("bölünebilen sayıların ortalaması:  " + avg);
        // kullanıcıdan alınan sayıya kadar olan sayıların 3 ve 4 e yani ikisinin ortak katı olan 12 sayısına
        // bölünen sayıların ortalmasını bulan program.
    }
}