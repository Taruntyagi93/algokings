nums=[183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211]
def findmax(arry):
            if arry==[]:
                return 0
            elif len(arry)<3:
                return max(arry)
            elif len(arry)==3:
                return max(arry[1],arry[0]+arry[2])
            else:
                return(max(arry[0]+findmax(arry[2:]),findmax(arry[1:])))
            
x=findmax(nums)
print(x)
        