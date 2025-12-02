Selection Sort 

Its basically looping through the list and getting max num all the time, put it in position 1, continue 
- O(n ^ 2)

Why selection sort is O(n²)
Selection sort does this:
Scan the whole array to find the smallest item
Put it in position 0
Scan the rest to find the next smallest
Put it in position 1
Repeat…

The scans look like this:
First pass: scan n items
Second pass: scan n−1 items
Third pass: scan n−2 items
…
Last pass: scan 1 item

Selection Sort is a neat algorithm, but its not fast
!! Quick sort is a faster algorithm since it takes O(n log n)


So theres 2 common variations 
1) Find smallest -> append to new array 
2) Find largest -> place it at the end of the same array 