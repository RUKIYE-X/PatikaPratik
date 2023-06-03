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
        System.out.println(isPalindrom("kayakçı"));
        System.out.println(isPalindrom2("abba"));

    }
}