class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        n = len(keysPressed)
        longestPress = releaseTimes[0]
        slowestKey = keysPressed[0]
        
        for i in range(1, n):
            currDuration = releaseTimes[i] - releaseTimes[i - 1]
            if currDuration > longestPress or (currDuration == longestPress and keysPressed[i] > slowestKey):
                longestPress = currDuration
                slowestKey = keysPressed[i]
                
        return slowestKey