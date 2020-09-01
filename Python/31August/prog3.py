n=int(input())
for outer in range(1,n*2):
    for inner in range(1,n+1):
        if((inner+outer)<=10  and   inner<=outer):
            print("*",end=" ")
        else:
            print("",end=" ")
    print()
