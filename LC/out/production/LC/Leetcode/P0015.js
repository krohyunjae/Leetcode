/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
  nums.sort((a, b) => a - b);
  let left = 0,
    mid = left + 1,
    right = nums.length;

  // Repeat until left reaches right
  while (left < right) {
    // Check if sum of all values pointed at is 0

    // If sum === 0, move the left pointer to the right and move to next iteration

    // If sum is > 0, move the right pointer to left

    // Else, move the middle pointer to right

    // If middle pointer surpasses right pointer, move left pointer to the right and reposition mid and right

    mid = left + 1;
    if (mid < right) {
    } else {
    }
  }
};

threeSum(nums);
