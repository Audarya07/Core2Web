print("Enter number :")
num=input()
ans=0
for i  in num:
    n=int(i);
    ans=ans+(n**4)
if(ans==int(num)):
    print("It is Narcisstic Number ");
else:
        print("It is  Not Narcisstic Number ");

