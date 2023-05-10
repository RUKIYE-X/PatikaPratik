import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physical,chemical,turkısh,music,avg;

        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        math = input.nextInt();
        System.out.print("fizik notunuzu giriniz: ");
        physical = input.nextInt();
        System.out.print("kimya notunuzu giriniz: ");
        chemical = input.nextInt();
        System.out.print("türkçe notunuzu giriniz: ");
        turkısh = input.nextInt();
        System.out.print("müzik notunuzu giriniz: ");
        music = input.nextInt();

        avg = (math + physical+ chemical+ turkısh+ music)/5;

        if(avg>=0 && avg<55){
            System.out.println("Seneye tekrar görüşürüz..");
            System.out.println("Ortalamanız: " + avg);
        }else if(avg>=55 && avg<=100){
            System.out.println("Tebrikler sınıfı geçtiniz:)");
            System.out.println("Ortalamanız: " + avg);
        }else{
            System.out.println("Geçersiz Ortalama!!");
        }
    }
}