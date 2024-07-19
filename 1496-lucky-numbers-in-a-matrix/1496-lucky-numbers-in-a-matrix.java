class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //System.out.println(matrix.length);
        //System.out.println(matrix[0].length);
        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            arr1.add(min);
            min = Integer.MAX_VALUE;
        }
        for(int j=0;j<matrix[0].length;j++){
            for(int i=0;i<matrix.length;i++){
             max = Math.max(max,matrix[i][j]);
            }
            arr2.add(max);
            max = Integer.MIN_VALUE;
       }
            
        //System.out.println(arr1);
        //System.out.println(arr2);
        //return arr1;
        List<Integer> arr3 = new ArrayList<>();
        for(int i=0;i<arr1.size();i++){
            if(arr2.contains(arr1.get(i)))
            arr3.add(arr1.get(i));
        }
        return arr3;
    }
}