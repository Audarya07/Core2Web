year = int(input("Enter year = "))
if(year % 4 == 0):
	if(year % 100 == 0):
		if(year % 400 == 0):
			print(year, "= Leap year")
		else:
			print(year, "= Not Leap year")
	else:
		print(year, "= Leap year")
else:
	print(year,"= Not leap year")