package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TempTest {

    Temp testObject = new Temp();

    @BeforeEach
    public void setup() {
        testObject = new Temp();
    }

    @Test
    public void testStuff() {

        String response = testObject.stuff();

        assertEquals("Hello", response, "Response was incorrect");

    }
  
}