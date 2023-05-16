import java.util.Scanner;
public class Baek1546 {
    static float usrMax(float[] nums) {
        float result = nums[0];
        for (int i = 1; i < nums.length; i++)
            result = (result > nums[i]) ? result : nums[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int N = stdin.nextInt();
        float maxVal;
        float sum = 0;
        float[] nums = new float[N];
        for (int i = 0; i < N; i++)
            nums[i] = stdin.nextFloat();
        maxVal = usrMax(nums);
        for (float num : nums)
            sum += num / maxVal * 100;
        System.out.println(sum/N);
    }
}

abstract class A {
    abstract static void methodA() {
        
    }
}
