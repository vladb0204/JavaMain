import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // creating input
        Scanner sc = new Scanner(System.in);
        
        // creating massiv
        int num = sc.nextInt();
        int[] nums = new int[num];

        // write massiv
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        
        // sorting
        Arrays.sort(nums);
        
        // printing massiv
        System.out.println(nums[nums.length-1]);
    }
}
