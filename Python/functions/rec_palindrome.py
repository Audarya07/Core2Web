i = 1
def palindrome(n):
    global i
    
    if i!=n:
        if str(i) == str(i)[::-1]:
            print(i)
            i+=1
            palindrome(n)
            
        else:
        
            i+=1
            palindrome(n)

palindrome(23)
