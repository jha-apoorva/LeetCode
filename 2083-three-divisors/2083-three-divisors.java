class Solution {
    public boolean isThree(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        if(arr.size()==3) return true;
        return false;
    }
}