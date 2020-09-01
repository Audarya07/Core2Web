n=int(input())
for outer in range(1,n*2):
    for inner in range(1,n+1):
        if((outer+inner)>=6 and (outer-inner<=4)):
            print("*",end=" ")
        else:
            print(" ",end=" ")
    print()
