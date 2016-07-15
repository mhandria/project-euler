#########################################################################################
#
#  name:        Michael Handria
#
#  date:        July 13, 2016
#
#  descrption:  This program will solve the first problem from
#				Project Euler's website: https://projecteuler.net/problem=3.
#               This is not the optimal way but also not a brute force either
#########################################################################################

# main function to run the program
def main():

    #the number that is trying to be factored
    value = 600851475143

    #the largest prime factor of value
    ans = 0

    #the previous Xi in order to determine if a number is a factor or not
    i = 1

    #iteration through a set number
    itr = 1
    list = [0]

    #bool variable that checks if the largest prime has been found
    ncheck = True

    #while loop that iterates through factors until the largest
    #prime factor has been found
    while(ncheck):

        #produce a sequence to test if it is a prime factor or not
        num = checkPrimeFactor(value, i)

        #adds the new list found above to a list
        list = list + num

        #uses euclidian's algorithm with recurssion to find the gcd
        check = euclidian(abs(list[itr]-list[itr*2]), value)

        #increment the iteration
        itr+=1

        #checks if the found number produced by num is a prime factor or not
        if(check > 1):

            #checks if it is the largest prime number factor or not
            if(check == value):

                #have the largest answer be displayed
                ans = check

                #end loop
                ncheck = False
            else:

                #set the value to another to find the largest prime factor
                value = value/check
        else:

            #set the previous Xi into a different value to allow new sequence
            i = num[1]

    #display answers
    print(ans)


#function to find a prime factor of N
#@N number to be factor
#@x number to help check for prime factor
def checkPrimeFactor(N, x):
    f = ((x**2) + 1)%N
    d = ((f**2) + 1)%N
    return [f, d]

#euclidians algorithm in recursion to gcd(a,b)
def euclidian(a, b):
    if(b==0):
        return a
    else:
        return euclidian(b, a%b)

main()