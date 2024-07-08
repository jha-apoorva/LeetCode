//import java.util.*;
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /*int i=0;
        int j=nums.size()-1;
        Collections.sort(nums);
        int count = 0;
        while(i<j){
            if(nums.get(i) + nums.get(j) < target){
                count += j-i;
                i++;
            }
            else if(nums.get(i) + nums.get(j) >= target){
                j--;
            }
        }
    return count;*/
    int count = 0;
    int n = nums.size();
    for(int i=0;i<n;i++){
        int k = nums.get(i);
        for(int j=i+1;j<n;j++){
            if(k + nums.get(j) < target){
                count++;
            }
        }
    }
    return count;
    }
}