class Solution {
    public long pickGifts(int[] gifts, int k) {
        long score = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int gift: gifts){
            score += gift;
            heap.add(gift);
        }
        while(k > 0){
            int maxGift = heap.remove();
            int rem = (int)Math.sqrt(maxGift);
            score = score - (long)maxGift + (long)rem;
            heap.add(rem);
            k--;
        }
        return score;
    }
}