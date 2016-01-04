from random import randint

def fill_array(array):
    filler = 0
    for i in range(0, len(array)):
    	array[i] = randint(1,10)
        i = i+1

def bozo_sort(array):
    #this assumes you can't "swap" the same index with itself
    element1 = randint(0,(len(array)-1))
    element2 = randint(0,(len(array)-1))
    array[element1], array[element2] = array[element2], array[element1]


def sorted_check(array):
    checker = 0
    for checker in range(len(array)-1):
        if(array[checker] > array[checker+1]):
            return False
    return True


tester = [3,1,7,6,8,9,4,2]
print("initial: %s" % tester);
steps = 0
while(not sorted_check(tester)):
    bozo_sort(tester)
    steps = steps+1
    print(tester)

print("%d steps" % steps)
print("SORTED!")