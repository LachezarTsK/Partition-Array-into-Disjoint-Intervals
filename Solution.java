public class Solution {

    /*
    Key points to observe:
    
    1. Initially set the last index for the first half to 0.
       And set the max value contained in the first half to nums[0].
    
    2. Keep track of all max values as you iterate through the array.
    
    3. If you encounter an element with value less than your initial max value,
       set the last index for the first half to the current index. 
       And set you new max value to the max value of all the elements encountered up to now.
    
    4. Repeat step 2 and 3 till the end of the array.
     */
    public int partitionDisjoint(int[] nums) {
        int minIndex = 0;
        int maxValueInFirstHalf = nums[0];
        int temp_maxValueInFirstHalf = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (maxValueInFirstHalf > nums[i]) {
                maxValueInFirstHalf = temp_maxValueInFirstHalf;
                minIndex = i;
            } else {
                temp_maxValueInFirstHalf = Math.max(temp_maxValueInFirstHalf, nums[i]);
            }
        }
        return minIndex + 1;
    }
}
