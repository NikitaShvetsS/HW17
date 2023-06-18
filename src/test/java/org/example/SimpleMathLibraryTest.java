package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMathLibraryTest {

    @org.junit.jupiter.api.Test
    void add() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.add(2, 3);
        assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        SimpleMathLibrary math = new SimpleMathLibrary();
        double result = math.minus(5, 3);
        assertEquals(2, result);
    }
}