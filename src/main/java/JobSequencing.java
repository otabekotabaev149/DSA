import java.util.Arrays;

public class JobSequencing {
    public static void main(String[] args) {

    }

    int[] JobScheduling(Job[] arr) {
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int maxDeadline = Arrays.stream(arr).mapToInt(job -> job.deadline).max().orElse(0);

        int[] slot = new int[maxDeadline];
        Arrays.fill(slot, -1);

        int maxProfit = 0;
        int countJobs = 0;

        for(Job job:arr){
            for(int i= job.deadline-1;i>=0;i--){
                if(slot[i] == -1){
                    slot[i] = job.id;
                    maxProfit += job.profit;
                    countJobs++;
                    break;
                }
            }
        }
        return new int[] {countJobs, maxProfit};
    }

    static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
}
