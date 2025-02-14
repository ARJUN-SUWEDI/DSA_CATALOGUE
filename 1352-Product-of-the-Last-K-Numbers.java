class ProductOfNumbers {
    ArrayList<Integer> a;
    int idx;
    public ProductOfNumbers() {
        a = new ArrayList<>();
        idx = Integer.MIN_VALUE;
    }
    
    public void add(int num) {
        if(num != 0 )
        {
            int s = a.size();
            if(s == 0)
                a.add(num);
            else{
                int x = a.get(s - 1);
                if(x != 0)
                    a.add(x * num);
                else
                    a.add(num);
            }
        }
        else
        {
            a.add(num);
            idx = a.size() - 1;
        }
    }
    
    public int getProduct(int k) {
        int s = a.size();
        int l = a.get(s - 1);
        if(idx >= s - k)
            return 0;
        if(k == s || a.get(s - k -1) == 0)
            return l;
        return l / a.get(s - k -1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */