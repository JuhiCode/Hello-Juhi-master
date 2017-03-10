/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juhi
 */
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of increment method, of class JavaApplication2.
     */
    @Test
    public void testIncrement() {
        JavaApplication2 instance = new JavaApplication2();
        int expResult = 1;
        int result = instance.increment();
        assertEquals("Failed 1",expResult, result);
    }

    /**
     * Test of decrement method, of class JavaApplication2.
     */
    @Test
    public void testDecrement() {
        JavaApplication2 instance = new JavaApplication2();
        int expResult = -1;
        int result = instance.decrement();
        assertEquals("Failed 2",expResult, result);
    }
    
}
