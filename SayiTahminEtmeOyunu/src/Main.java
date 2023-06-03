import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scan = new Scanner(System.in);

        int counter = 0 ,coun =0;
        boolean isWrong = false;
        int[] numbers = new int[5];

        while(counter<5){
            System.out.print( "Bir sayı Giriniz: ");
            int input = scan.nextInt();

            if(input<0 || input>99){
                System.out.println("0 ile 100 arasında bir sayı Giriniz!");
                if(isWrong){
                    System.out.println("Çok hatalı giriş yaptınız!!!");
                    counter++;
                }else{
                    System.out.println("Bir kez daha yanlış girilirse hakkınızdan düşülecektir!");
                    isWrong = true;

                }
            }else{
                counter++;

                if(input== number){
                    System.out.println("Tebrikler! Doğru tahmin ettiniz: ");
                    break;
                }else if(input>number){
                    System.out.println("Girdiğiniz değer büyük");
                }else if(input<number){
                    System.out.println("Girdiğiniz değer küçük");
                }
                numbers[coun] = input;
                coun++;
            }
            System.out.println("Kalan hakkınız: " + (5-counter));

        }
        System.out.println("tahminleriniz: " + Arrays.toString(numbers));

    }
}