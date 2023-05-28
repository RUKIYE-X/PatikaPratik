public class Boksorculer {

    String adi;
    int hasar;
    int can;
    int agirlik;
    int blokladi;
    int ilkBasla;

    Boksorculer(String boksorAdi,int boksorHasar,int boksorCan,int boksorAgirlik,int boksorBlokladi,int ilkBasla){
        this.adi = boksorAdi;
        this.hasar = boksorHasar;
        this.can = boksorCan;
        this.agirlik = boksorAgirlik;
        this.blokladi = boksorBlokladi;
        this.ilkBasla = ilkBasla;
    }
    int hasarVurdu(Boksorculer sonrakiBoksor){

        System.out.println(this.adi + " => " + sonrakiBoksor.adi + " " + this.hasar + " hasar vurdu");
        if(sonrakiBoksor.Bloklama()){
            System.out.println(sonrakiBoksor.adi + " gelen hasarı blokladı!");
            return sonrakiBoksor.can;
        }

        if(sonrakiBoksor.can - this.hasar < 0 ){
            return 0;
        }
        return sonrakiBoksor.can - this.hasar;
    }

    boolean Bloklama(){
        double randomval = Math.random()*100;
        return randomval <= this.blokladi;
    }

    boolean ilkBaslayanBoksor(){
        double randomSayi = Math.random()*3;
        return randomSayi <= this.ilkBasla;
    }
}
