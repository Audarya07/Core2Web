x = int(input())
cnt = 0
for i in range(x):
    check = str(i)
    for val in check:
        if val == "1":
            cnt+=1
print("Count=",cnt)
        

