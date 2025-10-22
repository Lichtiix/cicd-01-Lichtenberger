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

    // New test case added below
    @Test
    void greet_personalized_withSpaces() {
        assertEquals("Hello, Bob!", App.greet("  Bob  "));
    }
}
