class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        new = ""
        strs = sorted(strs)
        start = strs[0]
        end = strs[-1]
        for i in range(min(len(start),len(end))):
            if start[i] == end[i]:
                new += start[i]
            else:
                break
        return new
        