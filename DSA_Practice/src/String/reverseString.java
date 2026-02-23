package String;

import java.util.HashMap;
import java.util.Map;

public class reverseString {
    public static void countFreq(String s){
        HashMap<Character,Integer> sc = new HashMap<>();
        // first method
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sc.put(ch,sc.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : sc.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
        //second way
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        for(int i = 0; i < 26; i++){
            char a = (char)(i+'a');
            System.out.println(a + "--->" + arr[i]);
        }
    }
    public static void NonFirstRepeatingCharacter(String s){
        HashMap<Character, Integer> sc = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            sc.put(ch,sc.getOrDefault(ch,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sc.get(ch)== 1){
                System.out.println(ch);
                return;
            }
        }
    }
    public static void NonRepeatingSubString(String s){
        int left = 0;
        int maxLen = 0;
        HashMap<Character,Integer> sc = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(sc.containsKey(ch)){
                left = Math.max(left, sc.get(ch) + 1);
            }
            sc.put(ch,right);
            maxLen = Math.max(maxLen,right-left+1);

        }
        System.out.println(maxLen);
    }
    public static void KthDistinctAllowed(String s,int k){
        HashMap<Character,Integer> sc = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            sc.put(ch,sc.getOrDefault(ch,0)+1);
            while(sc.size()>k){
                char leftChar = s.charAt(left);
                sc.put(leftChar, sc.get(leftChar) - 1);
                if(sc.get(leftChar) == 0){
                    sc.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);

        }
        System.out.println(maxLen);
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
//        countFreq(s);
//        NonFirstRepeatingCharacter(s);
//        NonRepeatingSubString(s);
        KthDistinctAllowed(s,k);

    }
}
