Brute Force if we want to save space

Runtime: O(N * M)
Space: O(1)

class Solution {
public int strStr(String haystack, String needle) {
//so i is the index we start with
for (int i = 0; ; i++) {
for (int j = 0; ; j++) {
if (j == needle.length()) {
return i; //if this is true means everything is matched
}

                //we need something to prevent infinite loop, so if it reaches end of length, stop
                if (i + j == haystack.length()) {
                    return -1;
                }

                if (haystack.charAt(i + j) != needle.charAt(j)) { //this is to see how far we've matches our haystack into the needle
                    break;
                }
            }
        }
    }
}



//This uses substring

RunTime: O(N * M)
Space: O(M)

class Solution {
public int strStr(String haystack, String needle) {
int n = needle.length();
int h = haystack.length();
if (n > h) {
return -1;
}

// SUPER IMPORTANT <= so it runs atleast once -> 'a' 'a' case
        for (int i = 0; i <= h - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}






