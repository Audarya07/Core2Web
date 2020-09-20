num = 10
for i in range(4):
    for j in range(i+1):
        print(num**2,end="  ")
        num-=1
    print()
