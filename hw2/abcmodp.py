import sys

#primality test grabbed from:
#http://en.wikipedia.org/wiki/Primality_test#Python_implementation
def is_prime(n):
    if n <= 3:
        return n >= 2 #1 is not prime
    if n % 2 == 0 or n % 3 == 0:
        return False
    for i in range(5, int(n ** 0.5) + 1, 6):
        if n % i == 0 or n % (i + 2) == 0:
            return False
    return True


def modpow(x, y, n):
    if y==0 or x==1:
        return 1
    elif x==0:
        return 0
    else:
        output = x
        while y>1:
            output = (output*x)%n
            y = y-1
    return output

try:
    a= int(sys.argv[1])
    b= int(sys.argv[2])
    c= int(sys.argv[3])
    p= int(sys.argv[4])
except ValueError:
    print "enter numbers ya big dummy"
    sys.exit(1)
if(not is_prime(p)):
    print "p has to be prime ya big dummy"
    sys.exit(1)

print(modpow(modpow(a,b,p),c,p))


