'''
In this file, I will be writing my implementation for min heap data structure from scratch using the list only
heappush(arr, element)
heappop(arr)
heappeek(arr)
size(arr)
'''

def parent(i):
    return (i-1)//2

def left():
    return 2*i +1;

def right():
    rerurn 2*(i+2)

def swap(a,i,j):
    a[i] , a[j] = a[j] , a[i]

def heappush(arr, val):
    # 1. add element at the end of array, 
    # 2. while curr is not root or heap property not held:
    #         swap curr wid parent    
    #         curr index= parent index

    arr.append(val)
    i=len(arr)-1
    while i>0:
        pidx= parent(i)
        if arr[pidx]<=arr[i]:
            return
        swap(arr, i, pidx)
        i=pidx

    # Time Complexity : O(h) , h is height of heap

def heappop(arr):
    arr[0] , arr[-1] = arr[-1] , arr[0]
    ans = arr.pop()
    if arr:
        heapify(arr, 0)
    return ans

def heapify(arr, i):

    minidx=i
    left=left(i)
    if left<len(arr) and arr[left]<arr[i]:
        minidx = left

    right=right(i)
    if right<len(arr) and arr[right]<arr[i]:
        minidx = right


    if i!=minidx:
        swap(arr,i, minidx)
        heapify(arr, minidx)

def heappeek(arr):
    return arr[0]