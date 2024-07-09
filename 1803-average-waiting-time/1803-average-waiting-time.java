class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double timeWait = customers[0][1];
        int finish_prev = customers[0][0] + customers[0][1];
        for(int i=1;i<n;++i){
            int[] times = customers[i];
            int arrive = times[0];

            int start = Math.max(arrive,finish_prev);
            finish_prev = start + times[1];
            timeWait +=  finish_prev-arrive;
        }
        return timeWait/n;
    }
}