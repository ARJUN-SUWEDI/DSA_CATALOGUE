class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;++i){
            for(int j=0;j<words.length;++j){ 
                if(words[j].contains(words[i]) && i!=j){
                    if(!(list.contains(words[i]))){
                        list.add(words[i]);
                    }
                }
            }
        }
        return list;
    }
}