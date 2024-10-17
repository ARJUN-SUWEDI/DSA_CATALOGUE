class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c = -1;
        int a = -1;

        // Convert the numeric character to integer value for coordinate1
        int num1 = Character.getNumericValue(coordinate1.charAt(1));
        // Check if the column and row are consistent with the chessboard color
        if (coordinate1.charAt(0) == 'a' || coordinate1.charAt(0) == 'c' || 
            coordinate1.charAt(0) == 'e' || coordinate1.charAt(0) == 'g') {
            c = (num1 % 2 == 1) ? 1 : 0; // Odd row is black, even is white
        } else {
            c = (num1 % 2 == 1) ? 0 : 1; // Odd row is white, even is black
        }

        // Convert the numeric character to integer value for coordinate2
        int num2 = Character.getNumericValue(coordinate2.charAt(1));
        // Check if the column and row are consistent with the chessboard color
        if (coordinate2.charAt(0) == 'a' || coordinate2.charAt(0) == 'c' || 
            coordinate2.charAt(0) == 'e' || coordinate2.charAt(0) == 'g') {
            a = (num2 % 2 == 1) ? 1 : 0; // Odd row is black, even is white
        } else {
            a = (num2 % 2 == 1) ? 0 : 1; // Odd row is white, even is black
        }

        return a == c; // Return true if both coordinates have the same color
    }
}
