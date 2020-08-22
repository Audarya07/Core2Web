food = (("Indian","Fritters","Curry"), ("Chinese","Chopsy","Noodles"), ("American","Fries","Wraps"))
ans = [[food[j][i] for j in range(len(food))] for i in range(len(food[0]))]
for val in ans:
	print(tuple(val))