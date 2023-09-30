class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        a = list(set(nums))
        b = len(nums) // 3
        c = []
        
        for i in a:
            if nums.count(i) > b:
                c.append(i)
        return c