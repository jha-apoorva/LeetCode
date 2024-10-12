class Solution {
    public int minGroups(int[][] intervals) {
        int ans=0;
        int n = intervals.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            min = Math.min(min,intervals[i][0]);
            max = Math.max(max,intervals[i][1]);
        }
        int[] events = new int[max+2];
        for(int i=0;i<n;i++){
            events[intervals[i][0]]++;
            events[intervals[i][1]+1]--;
        }
        int sum=0;
        for(int i=min;i<max+2;i++){
            sum += events[i];
            ans = Math.max(ans,sum);
        }
    return ans;
    }
}