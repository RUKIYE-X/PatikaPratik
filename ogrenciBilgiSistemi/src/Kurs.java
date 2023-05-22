public class Kurs {
    String dersIsim;
    String dersKodu;
    int not;
    String bransAyniMi;
    Ogretmen ogretmen;
    Kurs(String dersIsim, String dersKodu,String bransAyniMi,Ogretmen ogretmen ){
        this.dersKodu = dersKodu;
        this.dersIsim = dersIsim;
        this.ogretmen = ogretmen;
        this.bransAyniMi = bransAyniMi;
        this.not = 0;
    }
    void OgretmenEkle(Ogretmen ogretmen){
        if(this.bransAyniMi == ogretmen.brans){
            this.ogretmen = ogretmen;
            //this.ogretmenBilgi();
        }else{
            System.out.println("yanlış ders seçimi!!");
        }
    }
    void ogretmenBilgi(){
        System.out.println(this.dersIsim + " dersi: " + this.ogretmen.isim);
    }
}
