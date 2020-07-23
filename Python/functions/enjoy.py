def enjoy():

    def movies(name="Tanhaji",area="Camp"):
        list1 = []
        list1.append(name)
        list1.append(area)
        return list1

    def game(name="Borderlands"):
        list2 = []
        list2.append(name)
        return list2

    return movies,game


def addList(ret):
    for val in ret:
        print(val)

ret = enjoy()
print(ret)

addList(ret)
