import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

//Пете дали последовательность чисел ai длины n и разрешили выбрать свое любимое целое число
//        x.
//        Петя должен взять все элементы последовательности ровно по одному разу (возможно, не в
//        исходном порядке), и для каждого элемента совершить операцию: изменить свое любимое число.
//        Пусть Петино любимое число до операции имело значение x, после операции оно должно иметь
//        новое значение x
//        2 − ai
//        . Петя расстроится, если в какой-то момент x станет меньше нуля. Найдите
//        минимальный подходящий x, который Петя может выбрать в качестве своего любимого целого
//        числа.
//        Формат входных данных
//        В первой строке дается целое число n (1 6 n 6 105
//        ) В следующей строке через пробел вводится
//        n целых чисел a1, . . . , ai
//        , . . . , an (1 6 ai 6 1018) — последовательность Пети.
//        Обратите внимание, что для ввода чисел вам понадобится 64-битный тип данных.
//        Формат выходных данных
//        Выведите одно число — такой минимальный x, с которым Петя сможет проделать все необходимые операции и не расстроиться.


public class Main {
    private static boolean isNormal(long a,long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            a = a * a - arr[i];
            if(a < 0) {
                return false;
            }
        }
        return true;
    }
    private static int MinimalNormal(long[] arr) {
        Arrays.sort(arr);
        long max = Math.max(arr.length, arr[arr.length - 1]) + 1;
        for (int i = 0; i < max; i++) {
            if(isNormal(i,arr)) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0;i < n;i ++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(MinimalNormal(arr));
    }
}
