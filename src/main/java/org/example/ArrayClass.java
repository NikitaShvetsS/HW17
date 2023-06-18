package org.example;

public class ArrayClass {

    public static int[] numsAfterLastFour(int[] array) {
        int lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                lastIndex = i;
            }
        }

        if (lastIndex == -1) {
            throw new RuntimeException("Array doesn't contain any four");
        }

        int[] result = new int[array.length - lastIndex - 1];
        for (int i = lastIndex + 1; i < array.length; i++) {
            result[i - lastIndex - 1] = array[i];
        }
        return result;
    }

    public static boolean checkArray(int[] array){
        boolean containsOne = false;
        boolean containsFour = false;

        for (int num : array) {
            if (num == 1) {
                containsOne = true;
            } else if (num == 4) {
                containsFour = true;
            }
        }
        return containsOne && containsFour;
    }
}
