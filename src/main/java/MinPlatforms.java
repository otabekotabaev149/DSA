import java.util.Arrays;

public class MinPlatforms {
    public static void main(String[] args) {

    }
    static int findPlatform(int arr[], int dep[], int n) {
        int res = 1, plat = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 1, j = 0;
        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                plat++;
                i++;
            } else {
                plat--;
                j++;
            }
            res = Math.max(res, plat);
        }
        return res;
    }
}
