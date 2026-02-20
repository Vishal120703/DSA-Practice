package Arrays;

public class MoveAllTheZeroesEnd {
    public static void moveZeroesAtEnd(int[]arr){
        int first = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[first];
                arr[first] = arr[i];
                arr[i] = temp;
                first++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0, 1, 0, 3, 12};
        moveZeroesAtEnd(arr);
    }
}
