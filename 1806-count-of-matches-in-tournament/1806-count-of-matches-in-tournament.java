class Solution {
    public int numberOfMatches(int n) {
        int numMatches = 0;
        int numTeams=0;
        while(n != 1){
            if(n%2 == 0){
                numMatches += n/2;
                numTeams = n/2;
            }
            else{
                numMatches += (n-1)/2;
                numTeams = (n-1)/2+1;
            }
        n=numTeams;
        }
    return numMatches;
    }
}