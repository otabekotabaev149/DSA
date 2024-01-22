public class Top_K_frequent_elements_in_array {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,4};
        int k = 2, len = arr.length;
        System.out.println(Arrays.toString(topK(arr, k)));
    }

    static int[] topK(int[] arr, int k){
        int kElements[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int e : arr){
            map.put(e, map.getOrDefault(e, 0)+1);
        }
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list = new ArrayList<>(map.entrySet());

        // Sort the list
        Collections.sort(list, (o1, o2) ->
        {
            if (o1.getValue() == o2.getValue())
                return o2.getKey() - o1.getKey();
            else
                return o2.getValue() - o1.getValue();
        });
        for (int i = 0; i < k; i++)
            kElements[i] = list.get(i).getKey();
        return kElements;
    }
}
