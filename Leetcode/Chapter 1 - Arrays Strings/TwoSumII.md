// If its sorted - we can do binary search to achieve O (log n) time
// Refer to chapter 1

- Binary Search
- Runtime: 0 ( n log n)
- space: O(1) because we only allocate left right mid target, maybe a couple temps the compiler creates, so its just O(1) 
  - not using additional storage beyond few integers, also big-0 never counts the exact number of var, just whether the space grows with space
  - 10 input. we use set amount of space, same with 100 input, and 1000 input
class Solution {
public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int result = binarySearch(numbers, target - numbers[i], i + 1);
            if (result != -1) {
                return new int[] {i + 1, result + 1};
            }
        }

        return new int[] {-1, -1};
    }

    private int binarySearch(final int[] arr, final int n, final int start) {
        int left = start; 
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == n) {
                return mid;
            }

            if (arr[mid] > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}




// This is using pointer and its better because of the runtime
- runtime: O(n)
- space: O(1)

  class Solution {
  public int[] twoSum(int[] numbers, int target) {
  int left = 0;
  int right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left] + numbers[right];

            if (temp == target) {
                return new int[] {left + 1, right + 1};
            }

            if (temp > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return new int[] {};
  }
  }