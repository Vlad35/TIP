import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void InitStrings(String[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < arr.length;i ++) {
            arr[i] = sc.nextLine();
            if(arr[i].length() != 4) {
                System.exit(0);
            }
        }
    }
    private static boolean isRight(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int countA = 1,countB = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[0]) {
                countA ++;
            }else {
                countB ++;
            }
        }
        return countA == countB  ? true : false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        InitStrings(arr);
        for (int i = 0; i < arr.length; i++) {
            if(isRight(arr[i])) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
