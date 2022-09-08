package Leetcode;

public class P0028 {
    public int strStr(String haystack, String needle){
        int needleLen = needle.length();
        if(needleLen == 0) return -1;        
        for(int i = 0; i < haystack.length()-needleLen+1; i++){
            if(haystack.substring(i, i+needleLen).equals(needle)) return i;
        }
        return -1;
    }
}
