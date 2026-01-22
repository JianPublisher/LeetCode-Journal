//page 92

// Skipping some explanation on how hashTable works

- If you want to store the different keys on the same slot since they have the same value, it would cause one to overwrite the other 
- For this case, its called - collision ( basically when 2 object produce the same hashcode())
- HashSet already handles collisions internally * using buckets that often store LinkedList
- ![img.png](img.png)

Not too important, but good hash function distribute values in array evenly 
- Bad hash function group values together and produce alot of collision


1) Good for catching duplicates 
2) Used for caching data 
3) fast search, insert and delete
4) Collisions are bad, need hash function to minimize collisions