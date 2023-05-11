import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        int four = 1,five = 1;
        System.out.println("4 ün katları");

        for (int i = 1;i<=number;i++){// 4 ün katlarını hesaplayan program
            four = 4*four;
            System.out.print(four + ",");
        }

        System.out.println();
        System.out.println("5 in katları");
        for (int i = 1;i<=number;i++) {// 5 üi katlarını hesaplayan program
            five = 5*five;
            System.out.print(five + ",");
        }//girilen sayıya kadar 4 ve 5 in kuvvetlerini alan program
    }
}