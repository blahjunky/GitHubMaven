package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @DisplayName("Simple multiplication should work")   
    public void testMultiply() {
        assertEquals(20, testApp.multiply(4,5),      
        "Regular multiplication should work");          
    }
}
