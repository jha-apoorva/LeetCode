class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        lst = []
        k=0
        for i in words:
            if x in i:
                lst.append(k)
            k += 1
        return lst

        