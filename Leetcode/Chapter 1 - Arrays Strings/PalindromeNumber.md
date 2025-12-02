Palindrome number 

Runtime: O(n)
Space: O(1)


class Solution {
public boolean isPalindrome(int i) {
int x = i;
if (x < 0) return false;

        int temp = 0;
        while (x > 0) {
            temp = temp * 10 + (x % 10);
            x /= 10;
        }
        return i == temp;
    }
}

