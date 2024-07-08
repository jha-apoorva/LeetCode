class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        lst = s.split(" ")
        lst1 = [i for i in lst if i.strip()]
        lst2 = lst1[::-1]
        return " ".join(lst2)
        