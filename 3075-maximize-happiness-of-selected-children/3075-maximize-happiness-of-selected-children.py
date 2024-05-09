class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort(reverse=True)
        sum=0
        for i in range(k):
            if(happiness[i]-i<=0):
                continue
            sum+=happiness[i]-i
            
        return sum