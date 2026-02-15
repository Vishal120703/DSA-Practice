package Arrays;

import java.util.HashMap;

public class twoSum {
    public static void solution(int[] nums, int target){
        HashMap<Integer,Integer> sc = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(sc.containsKey(target-nums[i])){
                System.out.println(i);
                System.out.println(sc.get(target-nums[i]));
                return;
            }
            sc.put(nums[i],i);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        solution(nums,target);

    }
}
