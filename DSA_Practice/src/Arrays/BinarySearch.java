package Arrays;

public class BinarySearch {
    public static int findElement(int[] arr,int target){
        int first = 0;
        int last = arr.length-1;
        int mid = 0;
        while(first <= last){
            mid = last-(last-first)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]> target){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,7,7,8,8,9,9,9};
        int target = 9;
        System.out.println(findElement(arr,target));
    }
}
