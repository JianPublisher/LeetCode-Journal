
Runtime - O(n)
Space - O(n)

class Solution {
public int lengthOfLongestSubstring(String s) {
HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i + 1 - left);
        }
        
        return max;
    }
}


Then theres better O(n) and O(1) space - single iteration 
Runtime - O(n)
Space - O(1) - even if its new int[256] because no matter the input size, all we need is that constant int[256]
      - never grows with input size 

class Solution {
public int lengthOfLongestSubstring(String s) {
int[] arr = new int[256]; //contain accii values
Arrays.fill(arr, -1);

        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] >= left) {
                left = arr[s.charAt(i)] + 1;
            }
            arr[s.charAt(i)] = i;
            max = Math.max(max, i + 1 - left);
        }

        return max;
    }
}