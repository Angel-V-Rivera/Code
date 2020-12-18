#############################################################################
#                             Angel Rivera                                  #
#                                                                           #
#                         Assignment 5: Sorting                             #
#                                                                           #
#############################################################################


#################################################################
#                                                               #
#                        Insertion Sort                         #
#                                                               #
#################################################################

dummyList = [9,8,7,6,5,4,3,2,1]
dummyList2 = [54,26,23,32,69,31,44,55,20]

def insertionSort2(dummyList):             #The running time for this funciton 
    sortedList = []                        #is O(n^3) because we have a while-
    if(len(sortedList)==0):                #loop that runs a n number of times
        sortedList.append(dummyList.pop(0))#inside of a for-loop that also runs
    for x in dummyList:                    #a n number of times, in addition
        count=-1                           #inside the while-loop we have insert
        moved=False                        #that runs on O(n).
        while(count<len(sortedList)-1):    
            count+=1
            if(sortedList[count]>=x):
                sortedList.insert(count,x)
                moved=True
                break 
        if(moved==False):
            sortedList.append(x)         
    return sortedList

print("Insertion Sort")
print(insertionSort2(dummyList))
print(insertionSort2(dummyList2))

#################################################################
#                                                               #
#                        Bubble Sort                            #
#                                                               #
#################################################################

dummyList3 = [9,8,7,6,5,4,3,2,1]
dummyList4 = [54,26,23,32,69,31,44,55,20]

def bubbleSort(dummyList):                  #The running time for this function
    size = len(dummyList)-1                 #for this function is O(n^2) because
    for i in range (len(dummyList)):        #we have a nested for-loop and each one
        for j in range(0, size-i):          #runs a n number of times. Everything
            if(dummyList[j]>dummyList[j+1]):#else runs on constant time.
                temp=dummyList[j+1]
                dummyList[j+1]=dummyList[j]
                dummyList[j]=temp
    return dummyList

print()
print("Bubble Sort")
print(bubbleSort(dummyList3))
print(bubbleSort(dummyList4))

#################################################################
#                                                               #
#                        Selection Sort                         #
#                                                               #
#################################################################

dummyList5 = [9,8,7,6,5,4,3,2,1]
dummyList6 = [54,26,23,32,69,31,44,55,20]

def selectionSort(dummyList):                    #The running time for this function
    size = len(dummyList)-1                      #is O(n^2) because we have a 
    for x in range(size,0,-1):                   #nested for-loop, each for-loop
        maxindex=0                               #running a n number of times.
        for y in range(0,x+1):                   #Everything else runs on constant
            if(dummyList[y]>dummyList[maxindex]):#time.
                maxindex = y
        temp = dummyList[x]
        dummyList[x] = dummyList[maxindex]
        dummyList[maxindex] = temp
    return dummyList

print()
print("Selection Sort")
print(selectionSort(dummyList5))
print(selectionSort(dummyList6))

#################################################################
#                                                               #
#                        Merge Sort                             #
#                                                               #
#################################################################

dummyList7 = [9,8,7,6,5,4,3,2,1]
dummyList8 = [54,26,23,32,69,31,44,55,20]

def merge(dummyListA,dummyListB):
    dummyListC =[]
    i = 0
    j = 0
    while(i < len(dummyListA) and j< len(dummyListB)):#The running time for 
        if(dummyListA[i] > dummyListB[j]):            #this function is O(n) 
            dummyListC.append(dummyListB[j])          #because each while loop 
            j+=1                                      #will run a n number of
        else:                                         #times, none of them are              
            dummyListC.append(dummyListA[i])          #nested and everything
            i+=1                                      #inside of each while loop
    while(i < len(dummyListA)):                       #runs on constant time.
        dummyListC.append(dummyListA[i])    
        i+=1
    while(j < len(dummyListB)):
        dummyListC.append(dummyListB[j])
        j+=1
    return dummyListC

def mergeSort(dummyList):             #The running time for this function is      
    if(len(dummyList)==1):            #O(nlogn) that is because while we have
        return dummyList              #slice which runs on O(n) time it will
    mid = len(dummyList)//2           #be running on O(logn) time because we
    lefthalf = dummyList[:mid]        #we are dividing pieces of the list in 
    righthalf = dummyList[mid:]       #half log n times and then we use merge
    lefthalf = mergeSort(lefthalf)    #to put them back together. Merge runs 
    righthalf = mergeSort(righthalf)  #on O(n) so O(n)*O(logn)=O(nlogn).
    return merge(lefthalf,righthalf)

print()
print("Merge Sort")    
print(mergeSort(dummyList7))
print(mergeSort(dummyList8))


