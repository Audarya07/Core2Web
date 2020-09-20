import numpy as np

def avgArray(x,y):
    sum = 0
    avg=0
    for i in x:
       sum+=i
    avg = sum//len(x)
    if avg in y:
        print("Average of Arr1 present in Arr2")
    else:
        print("Not present")

print("Array1 :")
arr1 = np.array([int(x) for x in input().split()])
print("Array2 :")
arr2 = np.array([int(x) for x in input().split()])

avgArray(arr1,arr2)
