Need to be in place

- Runtime O(n)
- Space - needs to be O(1) -> In place

To achieve this, we should use pointers 

class Solution {
public void reverseWords(char[] s) {
reverse(s, 0, s.length - 1);

        //now if the s was "hi there", it becomes 'ereht ih'
        //so now we need to call the reverse again, but on each word
        int start = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == ' ') {
                reverse(s, start, i - 1); //since i is the space, thats why I do i - 1 
                start = i + 1; //we dont start with space, we start with the next word
            } else if (i == s.length - 1) {
                reverse(s, start, i);
            }
        }
    }

    public void reverse (char[] s, int left, int right) {
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            right--;
            left++;
        }
    }
}