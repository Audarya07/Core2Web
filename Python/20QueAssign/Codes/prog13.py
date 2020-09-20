cnt = 64
for i in range(4):
    a = cnt
    for j in range(4):
        if i+j<3:
            print(" ",end=" ")
        elif i+j==3:
            print("=",end=" ")
        elif i+j>3:
            print(chr(a),end=" ")
            a-=1
    cnt+=1
    print()
