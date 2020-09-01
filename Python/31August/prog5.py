
cnt1=2
temp=cnt1
for outer in range(1,10):
    cnt=1
    flag=0
    for inner in range(1,10):
        if((inner+outer)>=6 and  (inner-outer)<=4 and (outer-inner)<=4 and (inner+outer)<=14):
            if((inner+outer)%2==0):
                if(outer<=5):
                    print(cnt,end="")
                    cnt+=1
                else:
                    print(cnt1,end="")
                    cnt1=cnt1+1
                    flag=1
            else:
                print(" ",end="")
        else:
            print(" ",end="")
    print()
    if(flag==1):
       cnt1=temp+1
       temp=temp+1


