sum = 0
def fun(start,end):
    global sum
    if start!=end+1:
        sum+=start
        start+=1
        fun(start,end)
    else:
        print(sum)
        return 0

start = int(input("Start:"))
end = int(input("End:"))
fun(start,end)
