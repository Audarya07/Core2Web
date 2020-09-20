def fun(list1):
    vowels = ['a','e','i','o','u']
    for i in list1:
        nv = []
        nc = []
        for j in i:
            if j in vowels:
                nv.append(j)
            else:
                nc.append(j)
        print("In string",i,",Vowels:",*nv,"and Consonants:",*nc)

list1 = ['shashi','ashish','rahul','kanha']
fun(list1)
