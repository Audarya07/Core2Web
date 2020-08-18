odd = [1, 3, 5, 7, 9]
print("odd numbers = ", odd)
odd_square = (x**2 for x in odd)	# generator expression 
print("Odd squares = ", list(odd_square))