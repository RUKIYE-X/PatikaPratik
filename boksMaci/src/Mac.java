public class Mac {
    Boksorculer bokscu1;
    Boksorculer bokscu2;
    int minAgirlik;
    int maxAgirlik;

    Mac(Boksorculer bokscu1, Boksorculer bokscu2, int minAgirlik, int maxAgirlik) {
        this.bokscu1 = bokscu1;
        this.bokscu2 = bokscu2;
        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;
    }

    void macaBasla() {
        if (agirlikUyusmasi()) {
            while (this.bokscu1.can > 0 && this.bokscu2.can > 0) {
                System.out.println("========================");
                this.bokscu2.can = this.bokscu1.hasarVurdu(bokscu2);
                if (kazananBoksor()) {
                    break;
                }
                this.bokscu1.can = bokscu2.hasarVurdu(bokscu1);
                if (kazananBoksor()) {
                    break;
                }
                yazdir();
            }
        } else {
            System.out.println("kilolar uyuşmuyor");
        }
    }

    boolean agirlikUyusmasi() {
        return (this.bokscu1.agirlik >= this.minAgirlik && this.bokscu1.agirlik <= this.maxAgirlik)
                && (this.bokscu2.agirlik >= this.minAgirlik && this.bokscu2.agirlik <= this.maxAgirlik);
    }

    boolean kazananBoksor() {
        if (this.bokscu1.can == 0) {
            System.out.println("kazanan: " + this.bokscu2.adi);
            return true;
        } else if (this.bokscu2.can == 0) {
            System.out.println("kazanan: " + this.bokscu1.adi);
            return true;
        }
        return false;
    }

    void yazdir() {
        System.out.println(this.bokscu1.adi + " kalan can: " + this.bokscu1.can);
        System.out.println(this.bokscu2.adi + " kalan can: " + this.bokscu2.can);
    }
}
