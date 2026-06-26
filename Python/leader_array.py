arr = [16, 17, 4, 3, 5, 2]
n = len(arr)

for i in range(n):
    isLeader = True

    for j in range(i+1, n):
        if arr[j] > arr[i]:
            isLeader = False
            break;
    if(isLeader):
        print(arr[i], end=" ")


