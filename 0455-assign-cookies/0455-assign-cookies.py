class Solution(object):
    def findContentChildren(self, g, s):
        s.sort()
        g.sort()

        count=0
        i,j=0,0
        while i<len(g) and j<len(s):
            if g[i]<=s[j]:
                count+=1
                i=i+1
            j=j+1
        return count        