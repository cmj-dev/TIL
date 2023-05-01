import java.util.Scanner;

public class Baek11720 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num;
        String nums;

        stdin.nextLine();
        nums = stdin.next();
        num = 0;
        for (int i = 0; i < nums.length(); i++) {
            num += nums.charAt(i) - '0';
        }
        System.out.println(num);
        stdin.close();
    }
}
