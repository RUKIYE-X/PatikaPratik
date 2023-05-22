public class Ogretmen {
    String isim;
    String brans;
    String telno;

    // kurucu metotlar sınıfın bütün niteliklerini alabilir
    Ogretmen(String isim,String brans,String telno){
        this.isim = isim;
        this.brans = brans;
        this.telno = telno;
    }

    void yazdir(){
        System.out.println("adı:" + this.isim);
        System.out.println("branşı:" + this.brans);
        System.out.println("telno:" + this.telno);
    }
}
