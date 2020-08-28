def prime(num):
    cnt=0;
    for i in range(2,num+1):
        if(num%i==0):
            cnt=cnt+1;
    if(cnt==1):
        return 1
    else:
        return 0;
print("enter the number : ")
num=int(input())
ans=prime(num)
rev1=0;
while(num!=0):
    rem=num%10;
    rev1=rev1*10+rem
    num=num//10
ans1=prime(rev1)
if(ans==ans1 and ans==1):
    print("Number is Emirp Number")
else :
    print("Number is  not Emirp Number")
