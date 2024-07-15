class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        String n = String.valueOf(num);
        for(int i=0;i<arr.length;i++){
            arr[i] = Character.getNumericValue(n.charAt(i));
        }
        Arrays.sort(arr);
        return arr[0]*10+arr[2] + arr[1]*10+arr[3];

    }
}