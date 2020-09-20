def sumTuple(x):
    return sum(x)

tup = tuple([int(x) for x in input().split()])
print("Sum:",sumTuple(tup))
