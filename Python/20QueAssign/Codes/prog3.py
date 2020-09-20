def fun(x):
    keys = list(dict1.keys())
    values = list(dict1.values())
    for i in range(len(dict1)):
        for i in keys:
            if i in values:
                dict1.pop(i)
                keys.remove(i)
                values.remove(i)
    return dict1

dict1 = {input("key:"):input("val:") for i in range(3)}
print("Before:",dict1)
ans = fun(dict1)
print("After:",ans)
