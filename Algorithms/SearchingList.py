#############################################################################
#    Andie Hoffman, Matthew Knop, Ben McEwen, Kevin Ritter, Angel Rivera    #
#                                                                           #
#                   `Assignment 4: Searching Lists                          #
#                                                                           #
#############################################################################



#################################################################
#                                                               #
#                        Number 1                               #
#                                                               #
#################################################################
def search_sorted_list(sorted_list, item):
    return binary_search_recursive(sorted_list,item,0,len(sorted_list)-1)

def binary_search_recursive(sorted_list,item,low,high):
    if(low > high):
        return False
    else:
        mid=(low + high)//2
        if(item == sorted_list[mid]):
            return True
        elif(item < sorted_list[mid]):
            return binary_search_recursive(sorted_list, item, low, mid-1)
        else:
            return binary_search_recursive(sorted_list, item, mid+1, high)
   

dummylist = [0, 1, 2, 3, 4, 5, 6, 7, 8]
print(search_sorted_list(dummylist, 5))
print(search_sorted_list(dummylist, 10))

#####################################################################
#                                                                   #
#                   Number 2 & 3                                    #
#                                                                   #
#####################################################################
	
class HashList():
    def __init__(self,length):        #The running time for this method is
        self.size = length            #O(n) because am using multiplication    
        self.data = [None] * self.size#and it can be any size (n). This applies for worse/best case. 

    def hashfunction(self,item,size):#The running time for this method is 
        return item%size             #O(1) becuase we are just getting the remainder. This applies for worse/best case.
    
    def rehash(self,prev,size):#The running time for this method is O(1) because 
        return (prev+1)%size# we are just getting the remainder. This applies for worse/best case.

    def put(self,item):                                   #The running time of this method in the best
        hashvalue = self.hashfunction(item,len(self.data))#case is O(1) because we only use the first
        if(self.data[hashvalue]==None):                   #3 lines which all of them run in constant
            self.data[hashvalue] = item                   #time (index,len).
        else:                                             
            nexts=self.rehash(hashvalue,len(self.data))   #The running time of this method in the worst
            count=0                                       #case is O(n) because if a slot is already
            while(self.data[nexts] != None):              #taken we have to keep checking until we
                count+=1                                  #find a empty spot and that can happend a n
                nexts = self.rehash(nexts,len(self.data)) #number of times the list may even not have
                if(count>=len(self.data)):                #a empty spot forcing the program to go throught
                    return "Already full"                 #all the list.
            if(self.data[nexts] == None):
                self.data[nexts]=item

    def contains(self,item):
        hashvalue = self.hashfunction(item,len(self.data))#The running time of this method in the best
        if(self.data[hashvalue]==item):                   #case is O(1) because we only use the first
            return True                                   #3 lines which all of them run in constant
        else:                                             #time (index,len).
            nexts=self.rehash(hashvalue,len(self.data))
            count=0
            while(self.data[nexts] != item):             #The running time of this method in the worst
                count+=1                                 #case is O(n) because if we don't find it at the
                nexts = self.rehash(nexts,len(self.data))#first try we have to keep looking at each spot
                if(count>=len(self.data)):               #until we find the item and this can happend a
                    return False                         #n number of times the list may even not have the
            return True                                  #the item forcing the program to go throught
                                                         #all the list.

    def items(self):           #The running time of this method is O(n)
        lista=[]               #becuase we are using membership and everything 
        for x in self.data:    #else runs on constant time.
            if(x is not None):
                lista.append(x)
        return lista

a=HashList(9)
a.put(78)
a.put(5)
print(a.items())
print(a.contains(5))
print(a.contains(24))
#####################################################################
#                                                                   #
#                   Number 4                                        #
#                                                                   #
#####################################################################

#Convert HashList into dictionary, to convert the hashlist in to something
#similar to a python dictionary we could need to add a key value and then assosiate
#that key value to each element so when we want to get a item from the list
#we can just use the key we assigned for that value. To do that we could need
#to created a second list to keep the keys. The hash function could use the key value
#to calculate the position instead of the value.
            
   
    
    
            
        

     
