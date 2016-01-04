class PriorityQueue1:

    def __init__(self):
        self.heap = []
        self.size = 0

    def add(self, x):
        self.heap.append(x)
        self.size += 1
        self.sift_up(self.size-1)

    def remove(self):
        if self.size == 0:
            raise IndexError('Queue is empty')
        if self.size == 1:
            highest_priority = self.heap[0]
            self.heap = []
            self.size -= 1
            return highest_priority
        else:
            highest_priority = self.heap[0]
            self.heap[0] = self.heap.pop()
            self.size -= 1
            self.sift_down(0)
            return highest_priority

    def peek(self):
        return self.heap[0]

    def __str__(self):
        return str(self.heap)

    def __len__(self):
        return self.size

    def sift_up(self, i):
        parent = (i-1)/2
        if parent >= 0 and self.heap[parent] > self.heap[i]:
            self.heap[parent] , self.heap[i] = self.heap[i], self.heap[parent]
            self.sift_up(parent)

    def sift_down(self, i):
        child = (i*2)+1
        if child >= self.size:
            return
        if child + 1 < self.size and self.heap[child] > self.heap[child+1]:
            child += 1 
        if self.heap[i] > self.heap[child]:
            self.heap[child], self.heap[i] = self.heap[i], self.heap[child]
            self.sift_down(child)

x = PriorityQueue1()
x.add(2)
x.add(4)
x.add(1)
x.add(6)
x.add(5)
print(str(x))

print(x.peek())
print(str(x))
print(x.remove())
print(x.remove())
print(x.remove())
print(str(x))
print(x.remove())
print(x.remove())
