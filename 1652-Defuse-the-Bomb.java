class Solution {
    public int[] decrypt(int[] code, int k) {
    int result[] = new int[code.length];
    int index = 0, element_sum;

    if(k == 0)
    {
        return result;
    }
    else
    {
        for(int i = 0; i < code.length; i++)
        {
            element_sum = 0;
            if(k > 0)
            {
                index = i+1;
                for(int j = 0; j < k; j++)
                {
                    if(index == code.length)
                    {index = 0;}
                    element_sum += code[index];
                    index++;
                }
                result[i] = element_sum;
                element_sum = 0;
            }
            else
            {
                index = i-1;
                for(int j = 0; j < Math.abs(k); j++)
                {
                    if(index < 0)
                    {
                        index = code.length-1;
                    }
                    element_sum += code[index];
                    index--;
                }
                result[i] = element_sum;
                element_sum = 0;
            }
        }
    }
    return result;
    }

}