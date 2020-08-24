a = input("Enter 1st string : ")
b = input("Enter 2nd string : ")

if sorted(a) == sorted(b):
	print("Both are anagrams of each other")
else:
	print("Both are NOT anagrams of each other")