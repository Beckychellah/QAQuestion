/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackathonqa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NAOMI
 */
public class HackathonQATest {
    private final HackathonQA tests = new HackathonQA();
//    public HackathonQATest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of main method, of class HackathonQA.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        HackathonQA.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of multiplication method, of class HackathonQA.
     */
    @Test
    public void testMult() {
        
        System.out.println("mult");
        int n = 0;
        int i = 0;
       
        tests.multiply(2, 4);
   
     
        // TODO review the generated test code and remove the default call to fail.
    
    }
//    @Test
//    public void testMultiplicationWhenUserInputsInvalidValues(){
//     HackathonQA testing = new HackathonQA();
//     // assert statements
//  
//    }
}
