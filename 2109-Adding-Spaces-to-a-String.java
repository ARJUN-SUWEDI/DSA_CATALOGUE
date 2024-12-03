class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(i==spaces[ind]){
                sb.append(' ');
                sb.append(s.charAt(i));
                ind++;
                //This condition is to handle ArrayOutOfBoundException
                if(ind==spaces.length){
                    ind--;
                }
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
