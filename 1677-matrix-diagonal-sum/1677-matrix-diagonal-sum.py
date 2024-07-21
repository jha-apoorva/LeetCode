class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        sum1 = 0
        for i in range(0,len(mat)):
            sum1 += mat[i][i]
            if len(mat)-i-1 >= 0 and i != len(mat)-i-1:
                sum1 += mat[i][len(mat)-i-1]
        return sum1
        