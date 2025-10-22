package com.example.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void greet_default_whenNameBlank() {
        assertEquals("Hello, world!", App.greet(""));
    }

    @Test
    void greet_personalized() {
        assertEquals("Hello, Alice!", App.greet("Alice"));
    }

    @Test
    void greet_personalized_withSpaces() {
        assertEquals("Hello, Bob!", App.greet(" Bob ")); // This test now passes after trimming spaces in App.greet
    }
}
