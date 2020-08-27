print("Enter 3 numbers:",end=" ")
arr = [int(i) for i in input().split()]

first = arr[0] 
second = -10000 
third = -10000 
for i in range(1, len(arr)):  
    if (arr[i] > first): 
        third = second 
        second = first 
        first = arr[i] 
    elif (arr[i] > second): 
        third = second 
        second = arr[i] 
    elif (arr[i] > third): 
        third = arr[i] 
  
print("The third largest element is:", third) 