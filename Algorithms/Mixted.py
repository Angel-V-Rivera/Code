import itertools
import time

# sum of the first n positive integers
def Sumintegers(n):
    #n Number
    suma=0
    while n != 0:
        suma=suma + n
        n=n-1
    return suma

# check if it is a valid word to play
def Checkword(w):
    # w word
    with open("words.txt") as f:
        lines = []
        for line in f:
            lines.append(line.rstrip())
    if w in lines:
        return "valid word"
    else:
        return "invalid word"

# check word with a given set of titles
# type titles with not spaces
def CheckwordWtiles (t , w ):
    #t tiles to use
    #w word to check
    titles = list(t)
    word = list(w)
    titles.sort()
    word.sort()
    while(len(titles)>0 and len(word)>0):
        if titles[0]==word[0]:
            titles.remove(titles[0])
            word.remove(word[0])
        else:
            titles.remove(titles[0])
    if len(word) >= 1:
        return False
    elif(len(word)==0):
        return True

# see what words can be made with a given set of titles
# type titles with not spaces
def WordsWtitles(t):
    #t tiles
    valid =[]
    with open("words.txt") as f:
        lines = []
        for line in f:
            lines.append(line.strip())
    for y in lines:
        titles = list(t)
        word = list(y)
        titles.sort()
        word.sort()
        while(len(titles)>0 and len(word)>0):
            if titles[0]==word[0]:
                titles.remove(titles[0])
                word.remove(word[0])
            else:
                titles.remove(titles[0])
        if len(word) >= 1:
            r=0
        elif(len(word)==0):
            valid.append(y)
    return valid          

# solve the New York Times's puzzle
# type letters with no spaces
def puzzle(t, c):
    ##t introduce all the letters
    ##c specify witch letter is in the center
    valid =[]
    with open("words.txt") as f:
        lines = []
        for line in f:
            lines.append(line.strip())
    for y in lines:
        titles = list(t*7)
        word = list(y)
        titles.sort()
        word.sort()
        while(len(titles)>0 and len(word)>0):
            if titles[0]==word[0]:
                titles.remove(titles[0])
                word.remove(word[0])
            else:
                titles.remove(titles[0])
        if len(word) >= 1:
            r=0
        elif(len(word)==0 and len(y) >= 5 and c in y):
            valid.append(y)
    return valid

# see what set of titles makes the most words


def timer(function_name):
    start_time = time.time()
    value = function_name()
    end_time = time.time()
    return [end_time - start_time, value]



def Bingo():
    anagram_list = dict()
    maximun = 0
    bestcomb = None
    valid =[]
    with open("words.txt") as f:
        lines = []
        for line in f:
            if len(line.strip()) == 8 :
                b = list(line.strip())
                b.sort()
                b =''.join(b)
                lines.append(b)
    
    for x in lines:
        if anagram_list.get(x) is None:
                anagram_list[x] = 1
        else:
            anagram_list[x] += 1
            temp = anagram_list.get(x)
            if temp > maximun:
                maximun = temp
                bestcomb = x
    return bestcomb




    
        
        
