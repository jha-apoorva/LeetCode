class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) == len(t):
            newS = sorted(s)
            newT = sorted(t)
            return newS == newT
        