import java.util.*;

public class Main {
    private static String ConvertString(String s) {
        String resString = "";
        for(int i = 0;i < s.length() - 1;i ++) {
            if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                resString += s.charAt(i);
            }else if(s.charAt(i) != ' ') {
                resString += s.charAt(i);
            }
        }
        if (resString.charAt(0) == ' ') {
            resString = resString.substring(1,resString.length());
        }
        if(s.charAt(s.length() - 1) == ' ' && s.charAt(s.length() - 2) == ' ') {
            return resString;
        }else {
            resString += s.charAt(s.length() - 1);
        }
        return resString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to convert: ");
        String s = sc.nextLine();
        System.out.println(ConvertString(s));
    }
}
