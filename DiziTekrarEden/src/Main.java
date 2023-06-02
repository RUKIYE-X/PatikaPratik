import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 1, 7, 4, 2, 1, 3, 4, 6, 8, 10, 10, 8, 3, 5, 4};
        int[] duplicate = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i] == list[j]) && list[j] % 2 == 0) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[index++] = list[i];
                    }break;
                }
            }
        }
        for(int value : duplicate){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}