class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int n:nums)
            set.add(n);
int max=0;
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                int temp= n;
                int count=1;
                while(set.contains(temp+1))
                {
                    temp++;
                    count++;
                }
            max= Math.max(count,max);
            }
        }

        return max;
    }
}
