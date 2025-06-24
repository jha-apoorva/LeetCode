class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        Collections.sort(arr,(a,b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        return arr;
    }
}