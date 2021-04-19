package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
*/

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private App testApp;
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
        assertEquals(20, testApp.multiply(4,5),"Regular multiplication should work");          
    }
    
}
