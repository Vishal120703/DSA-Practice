package Arrays;

import java.util.HashSet;

public class SubArraySumEqualToK {
    public static void find(int[]arr, int k){
        HashSet<Integer> sc = new HashSet<>();
        int sum = 0;
        sc.add(sum);
        for(int i = 0; i < arr.length; i++){
            sum +=arr[i];
            if(sc.contains(sum-k)){
                System.out.println("true");
                return;
            }
            sc.add(sum);

        }
        System.out.println("false");
    }
    public static void find2(int[] arr, int k){
        HashSet<Integer> sc = new HashSet<>();
        sc.add(0);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
            if(sc.contains(sum-k)){
                count++;
            }
            sc.add(sum);
        }
        System.out.println(count+1);
    }
    public static void main(String[] args) {
        int [] arr = {3,4, -7, 1, 3, 3, 1, -4};
        int k = 7;
        find(arr,k);
        find2(arr,k);
    }
}
