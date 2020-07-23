'''
Output:

Before function x= Core2Web
Before function id(x)= 140328207838000
Inner x: Core2WebTechnologies
inner id(x)= 140328207833392
Outer x: Core2Web
outer id(x)= 140328207838000
After function x= Core2WebTechnologies
After function id(x)= 140328207833392

'''
def outer(x):

    def inner():
        global x
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
