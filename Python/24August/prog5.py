n = int(input("Enter number of dishes:"))
dish = {input("Enter dish name:") : input("Enter type:") for i in range(n)}
day = int(input("Enter weekday number:"))

cnt = 0
for k in dish:
	if dish[k] == "Veg":
		cnt += 1

if day % 2 == 0:
	print("Friend can eat = ",cnt)
else:
	print("Friend can eat = ",len(dish))