class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for (int n : nums) {
            if (count == 0) {
                element = n;
                count++;
            } else if (n == element)
                count++;
            else
                count--;
        }

        int count1 = 0;
        for (int n : nums)
            if (n == element)
                count1++;

        if (count1 > (nums.length / 2))
            return element;

        return -1;
    }
}