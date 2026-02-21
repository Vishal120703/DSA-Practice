package Arrays;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
    public static void LongestSubstring(String s){
        int first = 0;
        int maxLength = 0;
        HashSet<Character> sc = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sc.contains(ch)){
                while(sc.contains(ch)){
                    sc.remove(ch);
                    first++;
                }
            }

                sc.add(ch);
                maxLength = Math.max(maxLength,i-first+1);


        }
        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        String s = "bbbbb";
        LongestSubstring(s);
    }
}
