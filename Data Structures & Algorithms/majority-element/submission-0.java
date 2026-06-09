class Solution {
    public int majorityElement(int[] nums) {
        
        int count=0;
        int element=0;
        for(int n:nums)
        {
            if(count==0){
                element=n;
            }
            count +=(n==element)? 1:-1;
        }
        return element;
    }
}