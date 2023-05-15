package whole;

import java.util.ArrayList;
import java.util.List;

public class ouw {
    public static void main(String[] args) {
        String a = "pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }
    public static int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int count = 0;
        int max = 0;
        List<Character> list = new ArrayList<>();
        outerLoop:
        for(int i = 0; i<s.length(); i++){
            count=0;
            list.clear();
            for(int j = i+1; j<=s.length(); j++){
                counter=j-1;
                if(!list.contains(s.charAt(counter))){
                    count++;
                }else{
                    continue outerLoop;
                }
                list.add(s.charAt(counter));
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
