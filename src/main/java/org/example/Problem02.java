package org.example;

public class Problem02 {
    public static void SortArrays(int[] arr1, int[] arr2) {
        //Time complexity of O(1), space complexity of O(n) (allocating memory to new array with same size as arr1 of size n)
        int[] sortedArray = new int[arr1.length];
        int i, j = 0;
        int bufferStart = -1;

        //Time complexity of O(n) (iterating over arr1 until buffer is reached)
        while (bufferStart == -1) {
            if (arr1[j] == 0)
                bufferStart = j;
            j++;
        }

        j = 0;

        //time complexity of O(n), iterates over arr1 and arr2 and sorting until buffer is reached
        for (i = 0; i < bufferStart;) {

            if(arr1[i] < arr2[j]) {
                sortedArray[i + j] = arr1[i];
                i++;
            }
            else {
                sortedArray[i + j] = arr2[j];
                j++;
            }
        }

        //time complexity of O(n), copying the rest of arr2 that was greater than last element before buffer in arr1
        for (int k = j; k < arr2.length; k++) {
            sortedArray[i + k] = arr2[k];
        }

        //time complexity of O(n), copying sorted array over to arr1
        //no new memory is being allocated so space complexity is O(1)
        for (int k = 0; k < sortedArray.length; k++) {
            arr1[k] = sortedArray[k];
        }

    }
}
