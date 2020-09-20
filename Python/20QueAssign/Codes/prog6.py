import numpy as np

def sumArray(x,y):
    list1 = []
    for (i,j) in zip(x,y):
        list1.append(i+j)
    arr3 = np.array(list1)
    return arr3

print("Array1 :")
arr1 = np.array([int(x) for x in input().split()])
print("Array2 :")
arr2 = np.array([int(x) for x in input().split()])

print("Array3:",sumArray(arr1,arr2))

