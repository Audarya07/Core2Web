actors = {"Hemsworth": "Australian", "Jackman": "Australian", "Holland": "British", "Hiddleston": "British", "Cumberbatch" : "British", "Evans": "American", "RDJ": "American"}
marvel = {"Zoe":"F", "Hemsworth": "M", "Evans": "M", "Holland": "M", "Paltrow": "F", "Jackman": "M", "Hiddleston": "M", "Cumberbatch": "M"}
male = set([name for name,gender in marvel.items() if gender == "M"])
non_american = set([name for name,country in actors.items() if country != "American"])
print(non_american.intersection(male))