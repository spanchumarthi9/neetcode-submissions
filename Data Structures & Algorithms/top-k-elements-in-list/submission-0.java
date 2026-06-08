class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets, index = frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i <= nums.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            buckets[freq].add(entry.getKey());
        }

        // Step 3: Traverse from high frequency to low
        List<Integer> result = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && result.size() < k; i--) {
            result.addAll(buckets[i]);
        }

        // Convert to array of size k
        return result.stream().limit(k).mapToInt(n -> n).toArray();
         }
}
