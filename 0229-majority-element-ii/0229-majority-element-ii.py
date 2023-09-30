class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        a = len(nums)
        b = a // 3
        c = []
        
        for i in nums:
            if nums.count(i) > b:
                c.append(i)
        return list(set(c))