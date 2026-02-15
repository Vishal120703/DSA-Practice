package String;

public class firstNonRepeatingCharacter {
    public static int nonRepeat(String str){
        int [] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(arr[ch-'a'] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        nonRepeat(str);
    }
}
