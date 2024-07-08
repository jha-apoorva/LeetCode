class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        lst1 = [i for i in word1]
        lst2 = [i for i in word2]
        lst3 = []
        for i in range(max(len(lst1),len(lst2))):
            if i<len(lst1):
                lst3.append(lst1[i])
            if i<len(lst2):
                lst3.append(lst2[i])
        return ''.join(lst3)
        