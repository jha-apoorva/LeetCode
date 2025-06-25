class Solution {
    private long countEqual(int[] nums1, int[] nums2, long x) {
        long count = 0;
        for(int m : nums1) {
            if(m>0){
                int left=0,right=nums2.length;
                while(left < right) {
                    int mid = (left+right)/2;
                    if((long) m * nums2[mid] <= x){
                        left = mid+1;
                    } else {
                        right = mid;
                    }
                }
                count += left;
            }
            else if(m<0) {
                int left=0,right=nums2.length;
                while(left < right) {
                    int mid = (left+right)/2;
                    if((long) m * nums2[mid] <= x){
                        right = mid;
                    } else {
                        left = mid+1;
                    }
                }
                count += nums2.length - left;
            } else {
                if(x>=0) count += nums2.length;
            }
        }
    return count;
    }
    
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        long left = -1000000000000000L;
        long right = 1000000000000000L;

        while(left < right) {
            long mid = left + (right-left)/2;
            long count = countEqual(nums1,nums2,mid);

            if(count>=k) right = mid;
            else left = mid+1;
        }
    return left;
    }
}