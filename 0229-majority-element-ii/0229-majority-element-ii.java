class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for(int i : nums){
            if(frequency.containsKey(i))
                frequency.put(i,frequency.get(i)+1);
            else
                frequency.put(i,1);
        }
        for(int i : frequency.keySet()){
            if(frequency.get(i) > Math.floor(nums.length/3))
                arr.add(i);
        }
    return arr;
        
    }
}