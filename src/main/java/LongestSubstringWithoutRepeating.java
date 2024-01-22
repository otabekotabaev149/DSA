public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int maxLen = 0, len = arr.length;
        int current = 0;
        String str = "";
        if(s == ""){
            return 0;
        }
        if(len == 1){
            return 1;
        }

        for(int i=0;i<len;i++){
            if(str.indexOf(arr[i]) != -1){
                maxLen = Math.max(maxLen, str.length());
                str = str.substring(str.indexOf(arr[i])+1);
            }
            str += arr[i];
        }
        maxLen = Math.max(maxLen, str.length());
        return maxLen;
    }
}
