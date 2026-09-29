package ArrayProblems;

import java.util.HashMap;

public class repeatingValue {
    public static int repeater(int [] nums){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num : nums){
            frequency.put(num, frequency.getOrDefault(num,0)+1);
        }
        for(int i : nums){
            if(frequency.get(i) < 1){
                return i;
            }
        }
        return -1;
    }
}
