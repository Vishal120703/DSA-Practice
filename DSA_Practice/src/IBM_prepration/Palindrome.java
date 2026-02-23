package IBM_prepration;

public class Palindrome {
    public static boolean palindromString(String s){
        String str = s.toLowerCase();
        int first = 0;
        int last = str.length()-1;
        while(first <= last){
            if(str.charAt(first) == ' '){
                first++;

            }
            else if(str.charAt(last) == ' '){
                last--;
            }
            else if(str.charAt(first)!= str.charAt(last)){
                return false;
            }
            else{
                first++;
                last--;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man a plan a canal Panama";
        System.out.println(palindromString(s));
    }
}
