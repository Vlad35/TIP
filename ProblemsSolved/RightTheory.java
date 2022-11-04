import java.util.Scanner;

//Васе дали два числа A, B. Ему кажется, что эти числа были получены из некоторого натурального числа с помощью прибавления и вычитания n натуральных чисел. Причем к A все загаданные
//        числа прибавлялись, а из B вычитались. Более конкретно:
//        • A = X + x1 + x2 + . . . + xn
//        • B = X − x1 − x2 − . . . − xn
//Вам интересно, подходят ли какие-то натуральные числа X, x1, . . . , xn под Васину гипотезу.
public class Main {
    private static String isRightTheory(int a,int b,int n) {
        if(n == 0) {
            return a==b ? "Yes" : "No";
        }else {
            if((a - b) % 2 == 0 && (a - b) >= 2*n) {
                return "Yes";
            }
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(isRightTheory(A,B,n));
    }
}
