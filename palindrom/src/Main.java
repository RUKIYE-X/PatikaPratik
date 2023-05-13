public class Main {

    static int palindrom(int number){
        int rem = 0 , newNumber = 0,temp = number;

        while(temp != 0){
            rem = temp % 10;
            newNumber = newNumber * 10 + rem;
            temp = temp/ 10;
        }
        if(number == newNumber) {
            System.out.println("palindrom sayıdır: " + number);
            return number;
        }else {
            System.out.println("palindrom sayı değildir: " + number);
            return number;
        }

    }
    public static void main(String[] args) {
       palindrom(5);
    }
}