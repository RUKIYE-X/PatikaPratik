import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        Scanner input = new Scanner(System.in);
        System.out.println("doğum gününüzü girniz: ");
        day = input.nextInt();
        System.out.println("doğduğunuz ayın numara yazınız: ");
        System.out.println("1.ocak-2.şubat-3.mart-4.nisan-5.mayıs-6.haziran-7.temmuz-8.ağustos-9.eylül-10.ekim-11.kasım-12.aralık");
        int month = input.nextInt();

        if(month >0 && month <= 12) { // 12 tane ay olduğu için 12 den fazla girilmesinde hata veriyor.
            if (month == 1) {
                if (day > 0 && day <= 31) { // gün sayısında sınırlama yapıyor.
                    if (day <= 21) {
                        System.out.println("oğlak burcu.");
                    } else {
                        System.out.println("kova burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 2) {
                if (day > 0 && day <= 28) {
                    if (day <= 19) {
                        System.out.println("kova burcu.");
                    } else {
                        System.out.println("balık burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 3) {
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("balık burcu.");
                    } else {
                        System.out.println("koç burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 4) {
                if (day > 0 && day <= 30) {
                    if (day <= 20) {
                        System.out.println("koç burcu.");
                    } else {
                        System.out.println("boğa burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 5) {
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("boğa burcu.");
                    } else {
                        System.out.println("ikizler burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 6) {
                if (day > 0 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("ikizler burcu.");
                    } else {
                        System.out.println("yengeç burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 7) {
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("yengeç burcu.");
                    } else {
                        System.out.println("aslan burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 8) {
                if (day > 0 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("aslan burcu.");
                    } else {
                        System.out.println("başak burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 9) {
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("başak burcu.");
                    } else {
                        System.out.println("terazi burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 10) {
                if (day > 0 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("terazi burcu.");
                    } else {
                        System.out.println("akrep burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 11) {
                if (day > 0 && day <= 31) {
                    if (day <= 21) {
                        System.out.println("akrep burcu.");
                    } else {
                        System.out.println("yay burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            } else if (month == 12) {
                if (day > 0 && day <= 30) {
                    if (day <= 21) {
                        System.out.println("yay burcu.");
                    } else {
                        System.out.println("oğlak burcu.");
                    }
                } else {
                    System.out.println("geçersiz gün!!");
                }
            }
        }else{
            System.out.println("geçersiz ay numarası girdiniz..");
        }
    }
}