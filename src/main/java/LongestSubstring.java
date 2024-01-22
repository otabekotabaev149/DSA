public class LongestSubstring {
    public static void main(String[] args) {
        String s = "tmmzuxt";
//        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("aabaab!bb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = 0, mx = 0;
        int l = s.length();
        if(l == 0){
            return 0;
        }
        if(l == 1){
            return 1;
        }
        String str = "";
        for(int i=0;i<l;i++){
            if(str.indexOf(s.charAt(i)) != -1){
                mx = Math.max(len, mx);
                str = str.substring(str.indexOf(s.charAt(i)), str.length());
                len = str.length();
            }
            else{
                str = str + s.charAt(i);
                len++;

            }
        }
        mx = Math.max(len, mx);
        return mx;
    }
}
