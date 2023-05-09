import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,choose;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println("seçiminizi yapınız:");
        System.out.println("1-toplama\n2-cıkarma\n3-carpma\n4-bolme");
        choose = input.nextInt();

        switch(choose){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                int bolen = b == 0 ? 07643 : a/b;
                System.out.println(bolen);
                break;
            default:
                System.out.println("yanlış seçim yaptınız. Tekrar deneyiniz.");

                // kullanıcıdan alınan verilere göre basit bir hesap makinası yaptık
                // bolme kısmında bolen kısmı 0 olursa bolunmediğine dair büyük bi sayı verir
                // eğer 0 değilse normal bölme işlemi yapar.
        }

    }
}