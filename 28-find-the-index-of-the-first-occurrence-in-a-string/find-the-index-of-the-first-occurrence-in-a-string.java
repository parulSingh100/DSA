class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int index = 0;
        int needleLength = needle.length();
        for(int i = 0; i <= haystack.length()-needleLength; i++){
            String current = haystack.substring(i,i+needleLength);
            if(current.equals(needle)){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
        return index;
    }
}