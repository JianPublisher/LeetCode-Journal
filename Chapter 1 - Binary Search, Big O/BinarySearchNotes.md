Binary Search
-> Suppose you're searching for a word in a dictionary and it starts with O, you would start near the middle because you know O are going to be near the middle of the dictionary
-> Makes more sense for it to begin somewhere in the middle
#Input needs to be sorted for binary search to work
#If element you're looking for is in the input, binary search returns the position of where its located. Otherwise it returns null

With binary search, you guess the middle number, and eliminate the remaining numbers every time 
Its like number guessing game, pick a number and I'll guess 
1) you pick 90 
2) I start with 50, you say too low 
3) Right away, I know the number is between 51-100, and that eliminates 50 numbers 



Logarithms -> its the flip of exponentials 
Exponentials is basically like how many 10 do we need to multiply together to get 100? --> 2 
So logarith would be log10(100) = 2
10^2 = 100 -->  log10 100 = 2
10^3 = 1000 --> log10 1000 = 3
2^5 = 32 --> log2 35 = 5

!! In here, when we say log, we mean log base 2 !!
-> So for binary search, if you have 8 elements, worse case is to check 8 elements at most 
-> log 8 -> so we can say log n elements in worse case 

so for 1024 element, that will log 1024 -> 10 because 2 ^ 10 is 1024, so you'd have to check 10 numbers at most


!!! Binary search only works if your input is sorted !!! 

Question :
1) sorted list of 128 using binary search, what is the max steps needed?
   --> Log 128 -> so its 7
2) Suppose you double the size, whats the max steps now?
   --> 8 because double means 256, and I just need to multiple a 2 and thats it, so 7 + 1

