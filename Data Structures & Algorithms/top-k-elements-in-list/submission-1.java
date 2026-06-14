class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<PQ> pq = new PriorityQueue<>((a,b)->b.feequency-a.feequency);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            pq.add(new PQ(i,map.get(i)));
        }
        
        int[] ans = new int[k];
        
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().key;
        }

        return  ans;
    }


    class PQ{
        PQ(int k,int f){
            this.key = k;
            this.feequency = f;
        }
        int key;
        int feequency;
    }
}
