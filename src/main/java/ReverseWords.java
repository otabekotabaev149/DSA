public class ReverseWords {
    public static void main(String[] args) {

    }

    private static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] arr = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--) {
            stringBuilder.append(arr[i]);
            if(i > 0) stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
