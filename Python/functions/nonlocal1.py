'''
   --> 'nonlocal' keyword is used if we need the variable in nested function.
   --> The changes are within the scope of the function.
   --> If 'nonlocal' is not used then the inner() has read only access.
   --> To make changes to 'x' it has to be accessed using the  nonlocal keyword.
   --> immutable objects (int,str) are passed by value.Therefore any changes
       made to the object will create a new object (see id() below).

'''

def outer(x):   #This x is local variable for scope of outer()
    def inner():
        nonlocal x
        x+="Technologies"
        print("Inner x:",x)
        print("inner id(x)=",id(x))

    inner()
    print("Outer x:",x)
    print("outer id(x)=",id(x))


x = "Core2Web"
print("Before function x=",x)
print("Before function id(x)=",id(x))

outer(x)

print("After function x=",x)
print("After function id(x)=",id(x))
