import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberN,numberR,fakR,fakN,com;
        int diff,fakDiff;
        System.out.print("n sayısını Giriniz: ");
        numberN = input.nextInt();
        System.out.print("r sayısını Giriniz: ");
        numberR = input.nextInt();

        fakN =1;// n sayısnın faktöriyeli hesaplandı.
        for(int i = 1;i<=numberN;i++){
            fakN = fakN * i;
        }
        fakR = 1;// r sayısnın faktöriyeli hesaplandı.
        for (int j = 1;j <=numberR;j++){
            fakR = fakR * j;
        }
        diff = numberN-numberR;// iki sayının farkının faktöriyeli hesaplandı.
        fakDiff = 1;
        for (int j = 1;j <=diff;j++){
            fakDiff = fakDiff * j;
        }

        com = fakN / (fakR * fakDiff);// kombinasyon formülü ile hesaplanıp ekrana çıktı olarak verildi.
        System.out.println("C(n,r): " + com);
    }
}