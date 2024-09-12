package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
      int count = 1;
      for (int i = 1; i < nums.length; i++) {
          if (nums[i] != nums[i - 1]) {
              nums[count] = nums[i];
              count++;

          }
      }

        return count;
    }
}
// 1, 2, 2, 4, 3, 5, 5
// 1, 2, 2, 4, 3, 5, 5
//