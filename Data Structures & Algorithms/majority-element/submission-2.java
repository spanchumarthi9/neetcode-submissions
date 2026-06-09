class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int num:nums){
            if(count==0)
            {
                element=num;
                count++;
            }
            else if(element==num)
                count++;
            else
                count--;
        }
        int count1=0;
        for(int num:nums)
            {
                if(element==num)
                    count1++;
            }
        if(count1>nums.length/2)
            return element;
        
        return -1;
    }
}