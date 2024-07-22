class Solution(object):
    def frequencySort(self, nums):
            frequency = Counter(nums)
            nums.sort(key=lambda x: (frequency[x], -x))
            return nums

    
        