import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        fractionalKnapsack(4, new Item[]{}, 9);
    }

    static double fractionalKnapsack(int w, Item arr[], int n) {
        double maxValue = 0;
        Arrays.sort(arr, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());
        for(Item item:arr){
            if(item.weight < w){
                w -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += (item.value*1.0 / item.weight*1.0) * w;
                break;
            }
        }
        return maxValue;
    }

    static class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
        }
    }
}
