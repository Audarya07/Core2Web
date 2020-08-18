data = {"Watson" : "CSK", "Raina" : "CSK", "Dhoni" : "CSK", "Rohit" : "MI", "Malinga" : "MI", "Pandya" : "MI"}
teams = set(data.values())

for val in teams:
	print(val, "= ", [name for name,team in data.items() if team == val])