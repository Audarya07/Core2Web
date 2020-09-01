num=0
num1=num;
for outer in range(1,6):
    cnt=1
    for inner in range(1,10):
        if((inner+outer)>=6 and (inner-outer)<=4):
            if(inner<=5):
                num1=num1+1
                print(num1,end=" ")
                flag=1;
            else:
                print(num1-cnt,end=" ")
                cnt=cnt+1
        else:
            print(" ",end=" ")
    print()
    if(flag==1):
        num1=num+1
        num=num+1

