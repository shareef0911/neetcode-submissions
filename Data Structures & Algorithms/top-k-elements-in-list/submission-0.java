class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Store keys
        Integer[] values = map.keySet().toArray(new Integer[0]);

        // Sort by frequency
        Arrays.sort(values, (a, b) -> map.get(b) - map.get(a));

        // First k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = values[i];
        }

        return result;
    }
}
