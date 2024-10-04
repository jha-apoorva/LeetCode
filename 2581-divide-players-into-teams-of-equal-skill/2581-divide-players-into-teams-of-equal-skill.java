class Solution {
    public long dividePlayers(int[] skill) {
               Arrays.sort(skill);
        //System.out.println(Arrays.toString(skill));
        int[][] arr = new int[(skill.length)/2][2];
        int i=0;
        int j=skill.length-1;
        for(int k=0;k<arr.length;k++){
            arr[k][0] = skill[i];
            arr[k][1] = skill[j];
            i++;j--;
        }
        //System.out.println(Arrays.deepToString(arr));
        int sum = arr[0][0]+arr[0][1];
        long result=0;
        for(int[] num : arr){
            if(num[0]+num[1] != sum) return -1;
            else {
                result += num[0]*num[1];
            }
        }
        return result;
    }
}