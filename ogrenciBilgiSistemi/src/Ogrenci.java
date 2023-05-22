public class Ogrenci {
    String adi;
    String okulNo;
    int sinifi;
    Kurs kurs1,kurs2,kurs3,kurs4;
    int matsozlu,fizsozlu,kimsozlu,biosozlu;
    double matort,fizort,bioort,kimort;
    double ortalama;
    boolean gectiKaldi;

    Ogrenci(String adi, String okulNo,int sinifi,Kurs kurs1,Kurs kurs2,Kurs kurs3,Kurs kurs4){
        this.adi = adi;
        this.okulNo = okulNo;
        this.sinifi = sinifi;
        this.kurs1 = kurs1;
        this.kurs2 = kurs2;
        this.kurs3 = kurs3;
        this.kurs4 = kurs4;
        this.ortalama = 0.0;
        this.gectiKaldi = false;

    }

    void sinavNotuGir(int kurs1not,int kurs2not,int kurs3not,int kurs4not){
        if(kurs1not >= 0 && kurs1not <= 100){
            this.kurs1.not = kurs1not;
        }else this.kurs1.not = 0;

        if(kurs2not >= 0 && kurs2not <= 100){
            this.kurs2.not = kurs2not;
        }else this.kurs2.not = 0;

        if(kurs3not >= 0 && kurs3not <= 100){
            this.kurs3.not = kurs3not;
        }else this.kurs3.not = 0;

        if(kurs4not >= 0 && kurs4not <= 100){
            this.kurs4.not = kurs4not;
        }else this.kurs4.not = 0;

    }
    void sozluGir(int matsozlu,int fizsozlu,int kimsozlu,int biosozlu){
        this.matsozlu = matsozlu;
        this.fizsozlu = fizsozlu;
        this.kimsozlu = kimsozlu;
        this.biosozlu = biosozlu;
    }
    void OrtHesapla(){
        this.matort = ((this.kurs1.not)*0.8 + matsozlu*0.2);
        this.fizort = ((this.kurs3.not)*0.8 + fizsozlu*0.2);
        this.kimort = ((this.kurs4.not)*0.8 + kimsozlu*0.2);
        this.bioort = ((this.kurs2.not)*0.8 + biosozlu*0.2);

        this.ortalama = (this.matort + this.fizort+ this.kimort+ this.bioort) /4;
    }

    void gectiKaldi(){
        System.out.println("=============");
        this.OrtHesapla();
        this.notYazdir();
        if(this.ortalama >= 55){
            System.out.println("ortalamanız: " + this.ortalama + "\nGeçtiniz.");
            //System.out.println("hoca: " + this.kurs1.ogretmen.isim);
        }else{
            System.out.println("ortalamanız: " + this.ortalama + "\nKaldınız!");
        }
    }
    void notYazdir() {
        System.out.println(this.kurs1.dersIsim + " dersi: " + this.matort);
        System.out.println(this.kurs2.dersIsim + " dersi: " + this.bioort);
        System.out.println(this.kurs3.dersIsim + " dersi: " + this.fizort);
        System.out.println(this.kurs4.dersIsim + " dersi: " + this.kimort);
    }
}
