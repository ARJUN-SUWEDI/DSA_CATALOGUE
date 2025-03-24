class Solution {
        public int countDays(int days, int[][] meetings) {
        int lastSize = meetings.length;
        int sizeArray = lastSize;
        int size;

        do {
            //
            boolean find;
            size = 1;

            for (int i = 1; i < sizeArray; i++) {
                int[] meeting = meetings[i];
                int min = meeting[0];
                int max = meeting[1];

                find = false;

                for (int j = 0; j < size; j++) {
                    int[] current = meetings[j];

                    if (current[0] <= max && min <= current[1]) {
                        current[0] = Math.min(current[0], min);
                        current[1] = Math.max(current[1], max);
                        find = true;
                        break;
                    }
                }

                if (!find) {
                    meetings[size][0] = min;
                    meetings[size][1] = max;
                    size++;
                }
            }

            if (lastSize == size) {
                break;
            }

            lastSize = size;
        } while (true);

        int maxDays = meetings[0][0] - 1;

        for (int i = 1; i < size; i++) {
            maxDays += meetings[i][0] - meetings[i - 1][1] - 1;
        }

        int lastDay = meetings[size - 1][1];

        if (lastDay < days) {
            maxDays += days - lastDay;
        }

        return maxDays;
    }
}