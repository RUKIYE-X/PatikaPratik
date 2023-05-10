import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sıcaklık değeri Giriniz: ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsiniz.");
        } else if (heat>=5 && heat<15) {
            System.out.println("sinemaya gidebilirsiniz.");
        } else if(heat>=15 && heat<25){
            System.out.println("piknik yapabilirsiniz.");
        }else {
            System.out.println("yüzmeye gidebilirsiniz.");
        }
    } //kullanıcıdan girilen sıcaklık değerine göre hangi etkinliği yapacağına karar verilmiştir.
}