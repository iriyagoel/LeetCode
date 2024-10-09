class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        c=0
        r=0
        for i in s:
            if i=='(':
                c+=1
            elif i == ')':
                if c > 0:
                    c -= 1
                else:
                    r += 1
        return c + r
