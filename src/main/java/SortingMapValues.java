import java.util.*;

public class SortingMapValues {
    public static void main(String[] args) {
        //implementing HashMap
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(6, 5);
        hm.put(12, 3);
        hm.put(5, 6);
        hm.put(78, 12);
        hm.put(10, 21);
        hm.put(67, 1);
        hm.put(1, 9);
        System.out.println("Before Sorting:");
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry map = (Map.Entry)iterator.next();
            System.out.println("Roll no:  "+map.getKey()+"     Name:   "+map.getValue());
        }



        // Sorting map by values

        Map<Integer, String> map = sortValues(hm);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        System.out.println(set2.size());
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext())
        {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            System.out.println("Roll no:  "+me2.getKey()+"     Name:   "+me2.getValue());
        }
    }

    /**
     * method to sort values
     * @param map
     * @return
     */
    private static HashMap sortValues(HashMap map)
    {
        List list = new LinkedList(map.entrySet());


        //Custom Comparator
        Collections.sort(list, new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });


        //copying the sorted list in HashMap to preserve the iteration order
        HashMap sortedHashMap = new LinkedHashMap();
        ListIterator it = list.listIterator();
        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
