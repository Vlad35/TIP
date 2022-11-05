import java.util.Scanner;

//Вы — целеустремленный шахматный конь, который идет из левой нижней клетки доски до
//        правой верхней, доска же имеет габариты n × m клеток.
//        От вас требуется найти количество способов пройти через доску, если ваш конь ходит либо на
//        две клетки вправо и одну наверх, либо на две клетки вверх и одну направо за ход.
//        Формат входных данных
//        На вход даются два натуральных числа n, m, (1 6 n, m 6 50).
//        Формат выходных данных
//        Выведите одно число — количество способов добраться конем до правого верхнего угла доски.

public class Main {
    private static long NumberOfVAriations(int n, int m) {
        long dp[][] = new long[n + 1][m + 1];
        dp[1][1] = 1;
        for(int i = 2;i <= n;i ++) {
            for(int j = 2;j <= m;j ++) {
                dp[i][j] = dp[i - 1][j - 2] + dp[i - 2][j - 1];
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(NumberOfVAriations(n,m));
    }
}
