package Arrays;

public class containsMostWaterLevel1 {
    public static void containsMostWater(int[] arr){
        int left = arr.length-1;
        int right = 0;
        int currWater = 0;
        int maxWater = 0;
        while(left >right){
            currWater = (left-right)*(Math.min(arr[left],arr[right]));
            maxWater = Math.max(currWater,maxWater);
            if(arr[left]>arr[right]){
                right++;
            }
            else{
                left--;
            }
        }
        System.out.println(maxWater);
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        containsMostWater(arr);
    }
}
