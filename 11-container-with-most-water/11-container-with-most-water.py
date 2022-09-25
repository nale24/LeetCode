class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        
        left = 0
        right = n - 1
        currMaxArea = 0
        
        while left < right:
            currWidth = right - left
            currHeight = min(height[left], height[right])
            currMaxArea = max(currMaxArea, currWidth * currHeight)
            
            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1
                
        return currMaxArea