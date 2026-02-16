package Arrays;

public class ProductOFArrayExceptSelf {
    public static void solution(int[]arr){
        int n = arr.length;
        int right = 1;
        int[] sol = new int[n];
        sol[0] = 1;
        for(int i = 1; i < n; i++){
            sol[i] = sol[i-1]*arr[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            sol[i] = sol[i]*right;
            right *=arr[i];
        }
        for(int i = 0; i < sol.length; i++){
            System.out.println(sol[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solution(arr);

    }
}
