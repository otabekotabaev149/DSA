import java.util.Arrays;
import java.util.Comparator;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep, arr.length));
    }

    static int findPlatform(int arr[], int dep[], int n)
    {
        int minPlatforms=0;
        int platformNeeded=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int a=0, d=0;
        while(a<n && d<n){
            if(arr[a] <= dep[d]){
                platformNeeded++;
                a++;
                minPlatforms = Math.max(minPlatforms, platformNeeded);
            }
            else {
                platformNeeded--;
                d++;
            }
        }
        return minPlatforms;
    }
}