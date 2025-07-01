package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testApp() {
        assertTrue(true);
    }
    
    @Test
    public void testAppHasGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }
}
