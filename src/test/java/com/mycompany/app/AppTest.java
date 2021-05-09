package com.mycompany.app;


/** junit 4
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
**/

/** junit 5 **/
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App testApp;

    @BeforeEach
    public void setUp() throws Exception {
        testApp = new App();
    }


    /**
     * Rigorous Test :-)
     */
    @Test

    @DisplayName("Simple multiplication")
    public void testMultiply() {
        testApp = new App();
        assertEquals(20, testApp.multiply(4,5));
    }


    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        testApp = new App();
        assertEquals(0, testApp.multiply(0,5));
        assertEquals(0, testApp.multiply(5,0));
    }

}
