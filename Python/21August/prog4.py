from collections import Counter
inp_tup = ("UK", "US", "France", "China", "Russia", "US", "UK")
arr = Counter(inp_tup)
ans = []
for k,v in arr.items():
	if v > 1:
		ans.append(k)
print(tuple(ans))
