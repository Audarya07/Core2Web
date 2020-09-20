import numpy as np
import math

def cubeArray(x,y):
    for i in x:
        for j in y:
            if j==i**3:
                print("Index of",j,"which is cube of",i,"is",*np.where(y==j))

print("Array1 :")
arr1 = np.array([int(x) for x in input().split()])
print("Array2 :")
arr2 = np.array([int(x) for x in input().split()])

cubeArray(arr1,arr2)

