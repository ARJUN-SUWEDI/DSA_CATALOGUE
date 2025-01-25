class MedianFinder {
    int l;
    int r;
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        l=r=0;
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(!right.isEmpty() && num>right.peek()){
            right.add(num);
            r++;
            if(r>l){
                left.add(right.remove());
                r--;
                l++;
            }
        }
        else{
            left.add(num);
            l++;
            if(l-r>1){
                right.add(left.remove());
                l--;
                r++;
            }
        }
    }
    
    public double findMedian() {
        if((l+r)%2==0){
            return (left.peek()+right.peek())/2.0;
        }
        return left.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */