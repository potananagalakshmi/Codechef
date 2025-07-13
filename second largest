class Solution {
    public void moveZeroes(int[] arr) {
        int index = 0;  // Points to where the next non-zero should go

        // First pass: move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Second pass: fill the rest with 0s
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}
