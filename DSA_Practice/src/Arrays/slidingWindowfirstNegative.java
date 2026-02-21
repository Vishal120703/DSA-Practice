package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class slidingWindowfirstNegative {
    public static int[] firstNegative(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Queue<Integer> q = new LinkedList<>();

        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.add(i);   // store index
            }
        }

        int index = 0;

        // Slide the window
        for (int i = k; i <= n; i++) {

            // Store result for current window
            if (!q.isEmpty()) {
                result[index++] = arr[q.peek()];
            } else {
                result[index++] = 0;
            }

            // Remove elements out of window
            if (!q.isEmpty() && q.peek() <= i - k) {
                q.remove();
            }

            // Add next element to window
            if (i < n && arr[i] < 0) {
                q.add(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        firstNegative(arr,k);
    }
}
