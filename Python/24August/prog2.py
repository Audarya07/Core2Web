def compare(a, b):
	if a > b:
		print("a > b")
	elif a < b:
		print("b > a")
	else:
		print("a == b")

a = input("Enter 1st string : ")
b = input("Enter 2nd string : ")
compare(a, b)