n = int(input("How many dish you both want to have : "))
arr = [int(i) for i in input().split()][:n]
val = 0
for i in arr:
	if i % 2 == 0:
		val += i
val //= 2
total = sum(arr)
print("I pay = ",total - val)
print("Friend pays = ", val)