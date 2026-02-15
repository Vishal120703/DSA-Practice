package Arrays;

public class mergeTwoSortedArray {
    public static void createShortedArray(int[] arr1,int[]arr2){
        int[] arr = new int[arr1.length+ arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        if(i < arr1.length){
            while(i < arr1.length){
                arr[k] = arr1[i];
                i++;
                k++;

            }
        }
        else if(j < arr2.length){
            while(j < arr2.length){
                arr[k] = arr2[j];
                j++;
                k++;

            }
        }
        for (i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,4};
        int[] arr2 = {3,3,4,5,6,7};
        createShortedArray(arr1,arr2);
    }
}

