import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int majority = 0;
        for(int i : nums){
            if(frequency.containsKey(i)){
                frequency.put(i,frequency.get(i)+1);
            }
            else{
                frequency.put(i,1);
            }
        }
        for(int i : frequency.keySet()){
            if(frequency.get(i) > Math.floor(nums.length/2)){
                majority = i;
            }
        }
    return majority;
    }
}