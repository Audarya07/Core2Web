legacy = {7:"CSK", 3:"CSK", 13:"CSK", 45:"MI", 33:"MI", 99:"MI", 77:"DC", 41:"DC", 19:"DC"}

teams = set(legacy.values())

for val in teams:
	print(val, "= ", {name for name,team in legacy.items() if team == val})