movies = {"The last samurai":"Tom cruise,Ken", "Justice league":"Cavil,Gadot", "MI":"Tom cruise"}
print([k for k,v in movies.items() if "Tom cruise" in v])