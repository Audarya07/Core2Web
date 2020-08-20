val = {}
def solve(key=None, value=None):
	val[key] = value
	return val

for _ in range(5):
	ans = solve(input("Enter name = "), int(input("Enter score = ")))

print(ans)



