class Solution {
    public double largestTriangleArea(int[][] points) {
        double area=0;
        for(int[] i: points){
            for(int[] j: points){
                for(int[] k : points){
                    area = Math.max(area,0.5*Math.abs(i[0]*j[1]+j[0]*k[1]+k[0]*i[1]-j[0]*i[1]-k[0]*j[1]-i[0]*k[1]));
                }
            }
        }
        return area;
    }
}