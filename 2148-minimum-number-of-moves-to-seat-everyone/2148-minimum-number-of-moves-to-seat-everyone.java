class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        int n = students.length;
        for(int i=0;i<n;i++){
            moves += Math.abs(students[i]-seats[i]);
        }
    return moves;
    }
}