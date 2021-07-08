# -*- coding: utf-8 -*-
"""
Created on Fri Feb 26 15:29:38 2021

@author: there
"""

import sys

#class to keep track the node
class Node():
    def __init__(self, state, parent, action):
        self.state = state
        self.parent = parent
        self.action = action

#class to store the node in the frontier for the case of depth first search algorithm
class DFSFrontier():
    def __init__(self):
        self.frontier =[]
    def add(self, node):
        self.frontier.append(node)
    def contains_state (self, state):
        return any(node.state == state for node in self.frontier)
    def empty(self):
        return len(self.frontier) == 0
    def remove(self):
        if self.empty():
            raise Exception("failure")
        else:
            node = self.frontier[-1]
            self.frontier = self.frontier[:-1]
            return node

#class to store the node in the frontier for the case of breath first search algorithm
class BFSFrontier(DFSFrontier):
    def remove(self):
        if self.empty():
            raise Exception("failure")
        else:
            node = self.frontier[0]
            self.frontier = self.frontier[1:]
            return node

#main class for processing the input
class mazeSample():
    
    def __init__(self, fileinput):
        with open(fileinput) as fi:
            contents = fi.read()
        
        if contents.count("A") != 1:
            raise Exception("you have more than one starting poin")
        if contents.count("B") != 1:
            raise Exception("you have more than one goal")
            
        contents = contents.splitlines()
        self.height = len(contents)
        self.width = max(len(line) for line in contents)
        
        self.block = []
        for i in range (self.height):
            row = []
            for j in range (self.width):
                try:
                    if contents[i][j] == "A":
                        self.startpoint = (i,j)
                        row.append(False)
                    elif contents[i][j] == "B":
                        self.goal = (i,j)
                        row.append(False)
                    elif contents[i][j] == " ":
                        row.append(False)
                    else:
                        row.append(True)
                except IndexError:
                    row.append(False)
            self.block.append(row)
            
        self.solution = None
    
    def print(self):
        solution = self.solution[1] if self.solution is not None else None
        print()
        for i, row in enumerate (self.block):
            for j, colom in enumerate (row):
                if colom:
                    print(" ", end =(""))
                elif (i,j) == self.startpoint:
                    print("A", end ="")
                elif (i,j) == self.goal:
                    print("B", end ="")
                elif solution is not None and (i,j) in solution:
                    print("-", end ="")
                else:
                    print(" ", end ="")
            print()
        print()
    
    def neighbors (self,state):
        row, colom = state
        candidates = [("up", (row - 1, colom)),
         ("down", (row + 1, colom)),
         ("left", (row, colom - 1)),
         ("right", (row, colom + 1))]
        
        result = []
        
        for action , (x,y) in candidates:
            if 0 <= x < self.height and 0 <= y < self.width and not self.block[x][y]:
                result.append((action,(x,y)))
        return result

    def solve (self):
        
        #create an empty explored set
        self.exporedset = set()
        self.exploredset_total = 0 
        
        # initialize starting node
        start = Node (state = self.startpoint, parent= None, action=None)
        frontier = BFSFrontier()
        frontier.add(start)
        
        #finding solution
        while True:
            if frontier.empty():
                raise Exception ("There is no solution for your problem")
            
            node = frontier.remove()
            self.exploredset_total += 1
            
            if node.state == self.goal:
                actionsset = []
                cells = []
                while node.parent is not None:
                    actionsset.append(node.action)
                    cells.append(node.state)
                    node = node.parent
                actionsset.reverse()
                cells.reverse()
                self.solution = (actionsset, cells)
                return
            
            self.exporedset.add(node.state)
            
            for action, state in self.neighbors(node.state):
                if not frontier.contains_state(state) and state not in self.exporedset:
                    child = Node(state = state, parent = node,  action = action)
                    frontier.add(child)

output = mazeSample(sys.argv[1])
print("Working on finding your solution ...")
output.solve()
print("States Explored:", output.exploredset_total)
print("Solution:")
output.print()                  