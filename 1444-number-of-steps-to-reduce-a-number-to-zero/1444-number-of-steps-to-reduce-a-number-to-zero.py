class Solution(object):
    def numberOfSteps(self, num):
        """
        :type num: int
        :rtype: int
        """
        def helper(num,steps):
            if num == 0:
                return steps
            if num % 2 == 0:
                return helper(num//2,steps+1)
            return helper(num-1,steps+1)
        return helper(num,0)
        