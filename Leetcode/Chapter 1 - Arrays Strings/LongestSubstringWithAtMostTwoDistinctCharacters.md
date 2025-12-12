

Time complexity - O(n) -> loop once with pointer , left pointer moves to the right, no pointer moves backwards
Space complexity - O(1) because fix [256] and numDistinct left max etc are constant space


class Solution {
public int lengthOfLongestSubstringTwoDistinct(String s) {

        //2 distinct -> aaaabbbb this works, just need 2 same character basically 
        //🔥 The window does NOT need to remove the “right” character.
        // 🔥 The window only needs to shrink until the constraint is valid again.

        int[] count = new int[256]; //ascii length, and instead of storing the left index, it just stores the count
        //so how do we know what left index to use? we use pointer

        int left = 0;
        int numDistinct = 0; //How many different characters currently exist in the window - is valid IF ITS < 2

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)]  == 0) { //if this character isn't in the count == neverappear before
                numDistinct++; 
            } //works its like num++, it adds 1 
            count[s.charAt(i)]++; //this is adding to the right, so count++


            //since we do numDistinct++, we need to check if its > 2
            //if its bigger than 2, then we need to shrink the window
             while(numDistinct > 2) {
                    //We start by removing the leftmost character from window 
                    count[s.charAt(left)]--; //if we decrease that count...it means 1 occurence of that character is leaving..

                    if (count[s.charAt(left)] == 0) {
                        numDistinct--;
                    }

                    left++;
                }
                max = Math.max(max, i + 1 - left);
        }

            return max;
    } 

}