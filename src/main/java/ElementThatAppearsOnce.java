public class ElementThatAppearsOnce {
    public static void main(String[] args) {
        int[] A = {2, 2, 5, 5, 20, 30, 30};
        System.out.println(search(A, A.length));
    }

    static int search(int[] A, int N){
        int low = 0;
        int high = N-1;
        while(low <= high){
            if(A[low] == A[low+1]){
                low+=2;
            }
            else{
                return A[low];
            }
            if(A[high] == A[high-1]){
                high-=2;
            }
            else{
                return A[high];
            }
        }
        return -1;
    }
}
