def fun(num):
    if num==1:return num
    else:return num*fun(num-1)

num = int(input("Enter number:"))
print(fun(num))
