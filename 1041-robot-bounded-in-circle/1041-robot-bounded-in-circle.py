class Solution:
    def isRobotBounded(self, instructions: str) -> bool:
        x = y = 0
        #coordinate of robot when going toward different directions: N: 0, E: 1, S: 2, W: 3
        coordinates = [[0, 1], [1, 0], [0, -1], [-1, 0]] 
        
        index = 0 #initial index of coordinates
        
        for i in instructions:
            if i == 'L':
                index = (index + 3) % 4 #robot is turning left: going antinclockwise
            elif i == 'R':
                index = (index + 1) % 4 #robot is going clockwise
            else:
                x += coordinates[index][0]
                y += coordinates[index][1]
        
        return index != 0 or (x == 0 and y == 0)