package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassTest {

    @Test
    void numsAfterLastFour() {
        int[] array1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expected1 = {1, 7};
        assertArrayEquals(expected1, ArrayClass.numsAfterLastFour(array1));

        int[] array2 = {4, 4, 4};
        int[] expected2 = {};
        assertArrayEquals(expected2, ArrayClass.numsAfterLastFour(array2));

        int[] array3 = {1, 4, 3};
        int[] expected3 = {1, 4, 3};
        assertArrayEquals(expected3, ArrayClass.numsAfterLastFour(array3));
    }

    @Test
    void numsAfterLAstFour_RuntimeException(){
        int[] array = {1, 2, 3};

        try {
            ArrayClass.numsAfterLastFour(array);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Array doesn't contain any four", e.getMessage());
        }
    }

    @Test
    void checkArray() {
        int[] array1 = {1, 1, 1, 4, 4, 1, 4, 4};
        assertTrue(ArrayClass.checkArray(array1));

        int[] array2 = {1, 1, 1, 1, 1, 1};
        assertFalse(ArrayClass.checkArray(array2));

        int[] array3 = {4, 4, 4, 4};
        assertFalse(ArrayClass.checkArray(array3));

        int[] array4 = {1, 4, 4, 1, 1, 4, 3};
        assertFalse(ArrayClass.checkArray(array4));
    }
}