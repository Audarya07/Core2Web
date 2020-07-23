'''
    --> Mutable objects (list,set,dictionary) are passed by reference.
    --> id() remains the same throught the code i.e. changes are made
        to the same object.
'''

def outer(x):
    def inner():
        nonlocal x
        x.append("Technologies")
        print("Inner x:",x)
        print("inner id(x)=",id(x))

    inner()
    print("Outer x:",x)
    print("outer id(x)=",id(x))


x = [1,2,"Core2Web"]
print("Before function x=",x)
print("Before function id(x)=",id(x))

outer(x)

print("After function x=",x)
print("After function id(x)=",id(x))
