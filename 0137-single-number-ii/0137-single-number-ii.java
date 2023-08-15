class Solution {
     public static int singleNumber(int[] nums) {
      
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}