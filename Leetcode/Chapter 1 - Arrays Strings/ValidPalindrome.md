palindrome -> can use built-in java methods in the Character class  

Runtime : O (n)  - pointer at the start and end, move to the mid, so it access all the elements in the array once
Space complexity : O(1) - no additional data structure used

class Solution {
public boolean isPalindrome(String s) {
int left = 0;
int right = s.length() - 1;
while (left < right) {
if (!Character.isLetterOrDigit(s.charAt(left))) {
left++;
continue;
} else if (!Character.isLetterOrDigit(s.charAt(right))) {
right--;
continue;
}

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}