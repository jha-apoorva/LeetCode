class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        lst = []
        dct = dict(zip(heights,names))
        #print(dct)
        sortedDict = dict(sorted(dct.items(),reverse=True))
        #print(sortedDict)
        for i in sortedDict:
            lst.append(sortedDict[i])
            #print(lst)
        return lst