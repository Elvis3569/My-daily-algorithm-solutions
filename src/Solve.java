import java.util.ArrayList;
import java.util.Collections;

public class Solve {
    public static int swapArray(ArrayList<Integer> ratings){
        //4 3 5 1 6 2
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ratings.clone();
        int count = 0;
        for (int i = 0; i < ratings.size(); i++) {
            //find the minimum from thr cloned array
            int min = Collections.min(arr1);
            //find the index of the minimum
            int indexOfMin = arr1.indexOf(min);
            //remove the minimum number so that we can get new minimum number each time we need it
            arr1.remove(indexOfMin);
            int lastIndex = ratings.size() - i - 1;
            int lastElement = ratings.get(lastIndex);
            int indexMin = ratings.indexOf(min);
            // don't swap if the minimum number is already in the position we want to move it to
            if(min != lastElement){
                ratings.set(indexMin, lastElement);
                ratings.set(lastIndex, min);
                count++;
            }
        }
        return count;
    }
}
