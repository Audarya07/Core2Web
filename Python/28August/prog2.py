for outer in range(1,9+1):
    for inner in range(1,9+1):
        if((inner+outer)==6 or  (inner+outer)==14 or  (outer-inner)==4 or (inner-outer)==4 ):
            print("*",end="");
        else:
            print(" ",end="")
    print()

