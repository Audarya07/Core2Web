num0 = 0
num1 = 1
sum = 0
for i in range(4):
    for j in range(i+1):
        sum = num0+num1
        num0 = num1
        num1 = sum
        print(num0,end="  ")
    print()

