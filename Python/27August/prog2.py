first=2
second=1;
cnt=0
while(cnt!=7):
    third=first+second
    if(cnt==0):
        print(first,end=" ")
    elif(cnt==1):
        print(second,end=" ")
    else:
        print(third,end=" ")
        first=second
        second=third
    cnt=cnt+1
print()
