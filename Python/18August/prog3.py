players = ["Kapil", "Kohli", "Raina", "Chahal", "Dhoni", "Pant", "Dravid", "Bumrah", "Harbhajan"]
n = len(players)
retired = ["Kapil", "Raina", "Dhoni", "Dravid", "Harbhajan"]
print("Given list = ", players)
print("Output : ")
for i in range(n-1, -1, -1):
	if players[i] in retired:
		print(players[i])