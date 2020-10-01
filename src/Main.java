import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        //Vlados lox
        System.out.println(nums[nums.length-1]);
    }
}