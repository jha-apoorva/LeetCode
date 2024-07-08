class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        if digits[-1] == 9:
            num = int(''.join([str(digit) for digit in digits]))
            num = num+1
            digits = [int(digit) for digit in str(num)]
        else :
            digits[-1] = digits[-1]+1
        return digits
        