class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> res = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : stones){
            res.add(i);
        }
        
        int x =0;
        int y =0;
        
        while(res.size() > 1){
            y = res.poll();
            x = res.poll();
            
            if(y>x){
                res.offer(y-x);
            }
        }
        
        return res.isEmpty() ? 0 : res.poll();
        
        
        
    }
}