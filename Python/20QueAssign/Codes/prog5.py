import numpy as np

def nameReverse(x):
    for i in range(len(cars)):
        cnt = 0
        for j in range(1,len(cars)):
            if cars[i] == cars[j][::-1]:
                cnt+=1
        print("Reverse string of",cars[i],"appeared",cnt,"times")

cars = np.array([x for x in input().split()])
nameReverse(cars)
