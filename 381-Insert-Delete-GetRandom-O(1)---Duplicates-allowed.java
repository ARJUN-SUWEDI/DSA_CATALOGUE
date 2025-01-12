class RandomizedCollection {

    private ArrayList<Integer> list;
    private Random random;


    public RandomizedCollection() {
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        list.add(val);
        return list.size() - 1 == list.indexOf(val);
    }

    public boolean remove(int val) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

        int last = list.get(list.size() - 1);
        list.set(index, last);
        list.remove(list.size() - 1);

        return true;
    }
    
    public int getRandom() {
        int ran = random.nextInt(list.size());
        return list.get(ran);
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */