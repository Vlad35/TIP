import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int NumbsOfPaths(int[][] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 1 && arr[j][i] == 1 && i != j) {
                    res ++;
                }
            }
        }
        res /= 2;
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        for(int i = 0;i < arr.length;i ++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(NumbsOfPaths(arr));
    }
}
