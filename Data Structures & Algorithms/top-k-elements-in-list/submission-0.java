class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.getValue(), a.getValue()));
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        pq.addAll(map.entrySet());
        int[] result = new int[k];
        int count = 0;
        for(int i = 0; i<k && !pq.isEmpty(); i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            result[i] = entry.getKey();
        }
        return result;

    }
}
