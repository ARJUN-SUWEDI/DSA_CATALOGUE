class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replace(",", " ");
        paragraph = paragraph.replace("  ", " ");
      paragraph = paragraph.replaceAll("\\p{Punct}", "").toLowerCase();
        
       String arr[] = paragraph.split(" ");
       int count=0,max=0;
       String maxString="";
       for(int i=0;i<arr.length;i++){
		   count=1;
            if(!Arrays.asList(banned).contains(arr[i])){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i].equals(arr[j]))count++;
                }
                if(count >max){
                    max=count;
                    maxString = arr[i];
					
                }
            }
            else{
                continue;
            }
       } 
       return maxString;
    }
}