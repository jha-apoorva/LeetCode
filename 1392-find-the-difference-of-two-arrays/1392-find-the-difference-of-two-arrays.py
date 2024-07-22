class Solution(object):
    def findDifference(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[List[int]]
        """
        lst1 = []
        for i in nums1:
            if i not in nums2 and i not in lst1:
                lst1.append(i)
        lst2 = []
        for i in nums2:
            if i not in nums1 and i not in lst2:
                lst2.append(i)
        return [lst1,lst2]