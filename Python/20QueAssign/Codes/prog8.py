import numpy as np

def occurrence(arr1):
    cnt = 0
    for i in arr1:
        test = str(i)
        for val in test:
            if val == "1":
                cnt+=1
    return cnt


arr1 = np.array([int(x) for x in input().split()])
print("1 appeared",occurrence(arr1),"times")
