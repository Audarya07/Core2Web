def fun(cnt):
    if cnt!=6:
        print(cnt)
        cnt+=1
        fun(cnt)
    else:
        return 0
cnt = 1
fun(cnt)
