class Trie {

    Trie [] child;
    boolean isEnd; 
    public Trie() {
        child=new Trie[26];
        isEnd=false;
    }
    
    public void insert(String word) {
        Trie t=this;
        for(char ch:word.toCharArray()){
            if(t.child[ch-'a']==null){
                t.child[ch-'a']=new Trie();
            }
            t=t.child[ch-'a'];
        }
        t.isEnd=true;
    }
    
    public boolean search(String word) {
        Trie t=this;
        for(char ch:word.toCharArray()){
            if(t.child[ch-'a']==null){
                return false;
            }
            t=t.child[ch-'a'];
        }
        return t.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie t=this;
        for(char ch:prefix.toCharArray()){
            if(t.child[ch-'a']==null){
                return false;
            }
            t=t.child[ch-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */