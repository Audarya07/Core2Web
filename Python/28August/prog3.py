for outer in range(1,5+1):
    for inner in range(1,9+1):
        if((inner + outer) >= 6 and  (inner - outer) <= 4):
            print("+",end="")
        else:
            print(" ",end="")
    print()
