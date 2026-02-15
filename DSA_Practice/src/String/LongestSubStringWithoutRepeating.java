package String;

import java.util.HashMap;

public class LongestSubStringWithoutRepeating {
    //There are two methods
    //first method(Using HashMap)
    public static void method1(String s){
        int first = 0;
        int maxLength = 0;
        HashMap<Character,Integer> sc = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sc.containsKey(ch)){
                first = Math.max(first,sc.get(ch)+1);

            }
            sc.put(ch,i);
            maxLength = Math.max(maxLength,i-first+1);
        }
        System.out.println(maxLength);
    }

    //second method using fixed Size array

    public static void main(String[] args) {
        String s = "abcdbb";
        method1(s);

    }
}
