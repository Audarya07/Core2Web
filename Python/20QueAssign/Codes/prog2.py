def fun(set1):
    list1 = list(set1)
    if len(set1)%2==0:
        print("Set is even")
    else:
        print("Middle element is",list1[len(list1)//2])

set1 = {x for x in input().split()}
fun(set1)
