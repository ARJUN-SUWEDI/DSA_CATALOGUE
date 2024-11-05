class Solution {
    public static void main(String[] args) {
    System.out.println(compressedString("aaabbbbcccddeee"));  // Example complex string
}

public static String compressedString(String word) {
    // Handle edge case for empty string
    if (word == null || word.length() == 0) {
        return "";
    }

    StringBuilder comp = new StringBuilder();
    int count = 0;
    for (int i = 0; i < word.length(); ++i) {
        count = 0;
        
        // Ensure we don't go out of bounds
        for (int j = i; j < word.length(); ++j) {  
            if (count == 9) {
            break;
            }
            if (word.charAt(i) == word.charAt(j)) {
                count++;
            } else {
                break;
            }
        }
        
        i = i + count - 1;  
        
        
        comp.append(count);
        comp.append(word.charAt(i));
    }
    return comp.toString();
}

}