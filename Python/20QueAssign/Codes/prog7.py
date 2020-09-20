import numpy as np

def num(arr1):
    for dummy in arr1:
        val = dummy
        factSum = 0
        armSum = 0
        while val:
            num = val%10
            fact = 1
            armSum += num**3 
            for i in range(1,num+1):
                fact*=i
                #print("fact=",fact)
            val//=10
            factSum+=fact
           
        if factSum == dummy:
            print(dummy,"is Strong number")
        elif armSum == dummy:
            print(dummy,"is Armstrong number")
        #else:
            #print(dummy,"is neither")

arr1 = np.array([int(x) for x in input().split()])

num(arr1)

