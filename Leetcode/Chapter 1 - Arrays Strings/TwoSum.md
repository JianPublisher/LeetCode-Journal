Brute force
- Runtime: O(n^2) because of 2 loop, checking all numbers manually 
- Space : O(1) not using any additional space

class Solution {
public int[] twoSum(int[] nums, int target) {
//Brute force - O(n^2)

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                } 
            }
        }
        return new int [] {};
    }
}


HashMap cache 
- Runtime: O(n) we loop the input array once
- Space: O(n)

  class Solution {
  public int[] twoSum(int[] nums, int target) {
  HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
  }
  }


