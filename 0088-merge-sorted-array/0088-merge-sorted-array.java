class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int length = m;

        for(int i=0; i<nums2.length; i++){

            nums1[length] = nums2[i];
            length++;    

        }

        // Arrays.sort(nums1);

        // nums1 = [1,2,3,2,5,6]

        // Optimized Bubble Sort
        for (int i = 0; i < nums1.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < nums1.length - 1 - i; j++) {

                if (nums1[j] > nums1[j + 1]) {

                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
        
    }
}