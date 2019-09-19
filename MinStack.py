# Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

# push(x) -- Push element x onto stack.
# pop() -- Removes the element on top of the stack.
# top() -- Get the top element.
# getMin() -- Retrieve the minimum element in the stack.

# Runtime: 68 ms, faster than 91.12% of Python3 online submissions for Min Stack.
# Memory Usage: 17.5 MB, less than 5.36% of Python3 online submissions for Min Stack.

class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.value=[]
        self.min=None
        
    def push(self, x: int) -> None:
        if self.value==[]:
            self.min=x 
            self.value.append(x)
        elif x<self.min :
            self.value.append(2*x-self.min)
            self.min=x 
        else:
            self.value.append(x)    
            
    def pop(self) -> None:
        if self.value[-1]<=self.min:
            self.min=2*(self.min)-self.value[-1]  
        self.value.pop() 
                
    def top(self) -> int:
        if self.value[-1]<=self.min:
            return(self.min)
        else:
            return self.value[-1]
        
    def getMin(self) -> int:
        return (self.min)
        

# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()