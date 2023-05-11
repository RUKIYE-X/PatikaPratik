import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        do{
            System.out.println("Bir Sayı Giriniz: ");
            number = input.nextInt();
            if(number%2 ==0){ // sayının çift olduğunu kontrol eder
                if(number%4 == 0){//sayının 4 e bölündüğünü kontrol eder
                    sum = sum + number;
                }
            }
        }while(number % 2 == 0);// tek sayı girilene kadar kullanıcıdan sayı girmesini ister.
        System.out.println("toplamı: " + sum); // 4 e bölünen sayıların toplamını verir.
    }
}