

RunTime: O(n)
Space complexity: O(n)


- Kinda tricky 
While iterating the string in reverse order, we keep track of a word's begin and end position
When we are at the beginning of the word, we append it - append(i, j)
- We loop from end of array to beginning
- i is the beginning
- j is the boundary of the last word



class Solution {
public String reverseWords(String s) {
StringBuilder sb = new StringBuilder();

        int j = s.length(); //not -1 because when we do substring its not inclusive

        for(int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                //always assume the next is a word is this is now a space
                j = i;
                continue;
            }

            //we now append if it hits the start of the list or if the word is complete
            if (i == 0 || s.charAt(i -1) == ' ') {
                if (sb.length() != 0) {
                    sb.append(' ');
                }
                sb.append(s.substring(i, j));
            }
        }

        return sb.toString();
    }
}


Then theres the splut solution ( easy )
- we speerate it into string[] by splitting it with existing space(s)

class Solution {
public String reverseWords(String s) {
String[] parts = s.split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (int i = parts.length -1; i>=0; i--) {
            reversed.append(parts[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}