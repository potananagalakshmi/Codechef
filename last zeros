class Solution {

    // The method name must match what the judge expects: moveZeroes
    public void moveZeroes(int[] arr) {
        int j = 0;                 // next position for a non‑zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap only when i and j are different
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;               // move target position forward
            }
        }
    }
}
