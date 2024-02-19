package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i == j){
                    continue;
                }
                if (nums[i] + nums[j] == target){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return null;
    }

}