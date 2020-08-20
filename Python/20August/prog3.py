dc = {"Germany":"Berlin", "Italy":"Venice", "France":"Versailles", "Canada":"Quebec City"}
cnt = 0
for k,v in dc.items():
	if cnt % 2 == 0:
		print(k)
		cnt += 1
	else:
		print(v)
		cnt += 1