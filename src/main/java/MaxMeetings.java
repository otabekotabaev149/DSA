import java.util.Arrays;

public class MaxMeetings {
    public static void main(String[] args) {
        int start[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int end[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};
        System.out.println(maxMeetings(start, end, end.length));
    }

    public static int maxMeetings(int start[], int end[], int n) {
        int lastEnd = -1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(end[i] > end[j]){
                    int temp = start[i];
                    start[i] = start[j];
                    start[j] = temp;

                    temp = end[i];
                    end[i] = end[j];
                    end[j] = temp;
                }
            }
            if(start[i] > lastEnd){
                res++;
                lastEnd = end[i];
            }
        }
        return res;
    }
}
