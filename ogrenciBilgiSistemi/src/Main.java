import com.sun.jdi.ObjectReference;

public class Main {
    public static void main(String[] args) {
        Ogretmen ogr1 = new Ogretmen("Rukiye","MAT","0576");
        Ogretmen ogr2 = new Ogretmen("Ayşe","FIZ","0546");
        Ogretmen ogr3 = new Ogretmen("Fatma","KIM","0543");
        Ogretmen ogr4 = new Ogretmen("Zeynep","BIO","6767");

        Kurs kursmat = new Kurs("matematik", "100","MAT",ogr1);
        kursmat.OgretmenEkle(ogr1);
        Kurs kursfiz = new Kurs("fizik" ,"101","FIZ",ogr2);
        kursfiz.OgretmenEkle(ogr2);
        Kurs kurskim = new Kurs("kimya" ,"102","KIM",ogr3);
        kurskim.OgretmenEkle(ogr3);
        Kurs kursbio = new Kurs("biyoloji" ,"103","BIO",ogr4);
        kursbio.OgretmenEkle(ogr4);

        Ogrenci ogrenci1 = new Ogrenci("A kişisi","1",3,kursmat,kursbio,kursfiz,kurskim);
        ogrenci1.sinavNotuGir(45,56,78,34);
        ogrenci1.sozluGir(89,55,89,80);
        ogrenci1.gectiKaldi();

        Ogrenci ogrenci2 = new Ogrenci("B kişisi","2",5,kursmat,kursbio,kursfiz,kurskim);
        ogrenci2.sinavNotuGir(85,78,78,34);
        ogrenci2.sozluGir(89,55,89,80);
        ogrenci2.gectiKaldi();

        Ogrenci ogrenci3 = new Ogrenci("C kişisi","3",4,kursmat,kursbio,kursfiz,kurskim);
        ogrenci3.sinavNotuGir(98,56,76,34);
        ogrenci3.sozluGir(89,55,89,80);
        ogrenci3.gectiKaldi();

        Ogrenci ogrenci4 = new Ogrenci("D kişisi","4",6,kursmat,kursbio,kursfiz,kurskim);
        ogrenci4.sinavNotuGir(54,56,45,60);
        ogrenci4.sozluGir(8,5,9,8);
        ogrenci4.gectiKaldi();

    }
}