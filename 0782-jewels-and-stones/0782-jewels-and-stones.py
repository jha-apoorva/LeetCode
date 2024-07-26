class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        lst = []
        for i in stones:
            if i in jewels: #and i not in lst:
                lst.append(i)
        return len(lst)