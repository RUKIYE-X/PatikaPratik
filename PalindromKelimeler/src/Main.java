import java.util.Scanner;
public class Main {

    static boolean isPalindrom(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    static boolean isPalindrom2(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }
        return str.equals(str2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string ifade giriniz: ");
        String input = scan.nextLine();

        System.out.println(isPalindrom(input));
        System.out.println(isPalindrom2(input));

    }
}
