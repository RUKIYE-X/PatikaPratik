public class Main {
    public static void main(String[] args) {
        Boksorculer boksor1 = new Boksorculer("Ali",10,120,70,10,1);
        Boksorculer boksor2 = new Boksorculer("Mike",5,100,85,12,2);

        Mac mac1 = new Mac(boksor1,boksor2,65,90);
        mac1.macaBasla();
    }
}