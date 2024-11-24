class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        boolean isNegativeCountEven = true, hasZeros = false;
        int minNumber = 100001, buffer;
        for (var row : matrix) {
            for (var number : row) {
                if (number < 0) {
                    isNegativeCountEven = !isNegativeCountEven;
                    buffer = number * -1;
                    if (buffer < minNumber) {
                        sum += minNumber;
                        minNumber = buffer; 
                    } else
                        sum += buffer;
                } else {
                    if (number == 0)
                        hasZeros = true;
                    else if (number < minNumber) {
                        sum += minNumber;
                        minNumber = number; 
                    } else
                        sum += number;
                }
            }
        }
        sum += -100001;
        if (isNegativeCountEven || hasZeros)
            sum += minNumber; 
        else
            sum -= minNumber;
        return sum;
    }
}