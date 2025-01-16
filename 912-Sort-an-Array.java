class Solution {
    
    // Function to find the maximum element in the array
    public int maximum_element(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to find the minimum element in the array
    public int minimum_element(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // // Merge Sort
    // public int[] mergeSort(int[] nums) {
    //     if (nums.length <= 1) {
    //         return nums;
    //     }
    //     int mid = nums.length / 2;
    //     int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
    //     int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
    //     return merge(left, right);
    // }

    // // Merge function used in Merge Sort
    // private int[] merge(int[] left, int[] right) {
    //     int[] merged = new int[left.length + right.length];
    //     int i = 0, j = 0, k = 0;
    //     while (i < left.length && j < right.length) {
    //         if (left[i] <= right[j]) {
    //             merged[k++] = left[i++];
    //         } else {
    //             merged[k++] = right[j++];
    //         }
    //     }
    //     while (i < left.length) {
    //         merged[k++] = left[i++];
    //     }
    //     while (j < right.length) {
    //         merged[k++] = right[j++];
    //     }
    //     return merged;
    // }

    public int[] sortArray(int[] nums) {
        // return mergeSort(nums);
        // // return quickSort(nums);
        // // return radixSort(nums);
        // // return brickSort(nums);
        // return countingSort(nums);
        return heapSort(nums);


    }

    // // Quick Sort
    // public int[] quickSort(int[] nums) {
    //     quickSortHelper(nums, 0, nums.length - 1);
    //     return nums;
    // }

    // private void quickSortHelper(int[] nums, int low, int high) {
    //     if (low < high) {
    //         int pivot = partition(nums, low, high);
    //         quickSortHelper(nums, low, pivot - 1);
    //         quickSortHelper(nums, pivot + 1, high);
    //     }
    // }

    // private int partition(int[] nums, int low, int high) {
    //     int pivot = nums[high];
    //     int i = low - 1;
    //     for (int j = low; j < high; j++) {
    //         if (nums[j] <= pivot) {
    //             i++;
    //             swap(nums, i, j);
    //         }
    //     }
    //     swap(nums, i + 1, high);
    //     return i + 1;
    // }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // // Radix Sort
    // public int[] radixSort(int[] nums) {
    //     int max = maximum_element(nums);
    //     for (int exp = 1; max / exp > 0; exp *= 10) {
    //         countingSortByDigit(nums, exp);
    //     }
    //     return nums;
    // }

    // private void countingSortByDigit(int[] nums, int exp) {
    //     int[] output = new int[nums.length];
    //     int[] count = new int[10];
        
    //     for (int i = 0; i < nums.length; i++) {
    //         count[(nums[i] / exp) % 10]++;
    //     }
        
    //     for (int i = 1; i < 10; i++) {
    //         count[i] += count[i - 1];
    //     }
        
    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         output[count[(nums[i] / exp) % 10] - 1] = nums[i];
    //         count[(nums[i] / exp) % 10]--;
    //     }
        
    //     System.arraycopy(output, 0, nums, 0, nums.length);
    // }

    // // Brick Sort
    // public int[] brickSort(int[] nums) {
    //     int n = nums.length;
    //     boolean isSorted = false;
    //     while (!isSorted) {
    //         isSorted = true;
    //         // Odd indexed pass
    //         for (int i = 1; i < n - 1; i += 2) {
    //             if (nums[i] > nums[i + 1]) {
    //                 swap(nums, i, i + 1);
    //                 isSorted = false;
    //             }
    //         }
    //         // Even indexed pass
    //         for (int i = 0; i < n - 1; i += 2) {
    //             if (nums[i] > nums[i + 1]) {
    //                 swap(nums, i, i + 1);
    //                 isSorted = false;
    //             }
    //         }
    //     }
    //     return nums;
    // }

    // // Counting Sort
    // public int[] countingSort(int[] nums) {
    //     int max = maximum_element(nums);
    //     int[] count = new int[max + 1];
    //     int[] output = new int[nums.length];

    //     for (int num : nums) {
    //         count[num]++;
    //     }

    //     for (int i = 1; i <= max; i++) {
    //         count[i] += count[i - 1];
    //     }

    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         output[count[nums[i]] - 1] = nums[i];
    //         count[nums[i]]--;
    //     }

    //     System.arraycopy(output, 0, nums, 0, nums.length);
    //     return nums;
    // }

    // Heap Sort
    public int[] heapSort(int[] nums) {
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(nums, 0, i);
            heapify(nums, i, 0);
        }
        return nums;
    }

    private void heapify(int[] nums, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && nums[left] > nums[largest]) {
            largest = left;
        }

        if (right < n && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(nums, i, largest);
            heapify(nums, n, largest);
        }
    }
}
