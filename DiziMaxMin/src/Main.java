import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15,2,78,-92,45,8,1,-1,-778,12,0};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int min = number;
        int max = number;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i : arr){
            if(i > number){
                max = i;
                break;
            }
        }
        for(int i =arr.length-1; i >=0 ;i--){
            if(arr[i] <number){
                min = arr[i];
                break;
            }
        }

        System.out.println(number + "' a yakın en büyük sayı " + max);
        System.out.println(number + "' a yakın en küçük sayı " + min);
    }
}