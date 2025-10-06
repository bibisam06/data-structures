package org.bibisam06.etc.slidingwindow;
/*
    슬라이딩 윈도우 예시 2 : 가장 긴 부분 문자열 구하기
*/
import java.util.*;
public class SlidingWindow2 {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3 ("abc")
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1 ("b")
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3 ("wke")
    }

    static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int maxLength = 0;
        int left = 0;


        for(int right=0; right<s.length(); right++) {
            char c = s.charAt(right);

            while(window.contains(c)) {
                window.remove(s.charAt(left));
                left ++;
            }

            window.add(c);
            maxLength = Math.max(maxLength, right - left + 1); //최대 길이 갱신

        }
        return maxLength;
    }
}
