/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarelotron;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roby
 */
public class SquarelotronTest {
    Squarelotron game = new Squarelotron(5);
    Squarelotron flip = new Squarelotron(5);
    
    public SquarelotronTest() {
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
     * Test of upsideDownFlip method, of class Squarelotron.
     */
    @Test
    public void testUpsideDownFlip() {
        int[][] testSquarelotron = {{21,22,23,24,25},{16,17,18,19,20},{11,12,13,14,15},{6,7,8,9,10},{1,2,3,4,5}};
        Squarelotron testFlip = new Squarelotron(5);
        testFlip.squarelotron = testSquarelotron;
        assertEquals(testFlip, game.upsideDownFlip(3));
        //test on squarelotron that's been manipulated - spun right, main diagonal, spun right, then upside down
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mainDiagonalFlip method, of class Squarelotron.
     */
    @Test
    public void testMainDiagonalFlip() {
        System.out.println("mainDiagonalFlip");
        
        //basic test
        int[][] testSquarelotron = {{1,6,11,16,25},{2,7,8,9,22},{3,12,13,14,19},{4,17,18,23,24},{5,10,15,21,20}};
        Squarelotron testFlip = new Squarelotron(5);
        testFlip.squarelotron = testSquarelotron;
        assertEquals(testFlip, game.upsideDownFlip(3));
        //test on squarelotron that's been manipulated - spun right, upside down flip, spun right, then maindiagonalflip
        
    }

    /**
     * Test of rotateRight method, of class Squarelotron.
     */
    @Test
    public void testRotateRight() {
        System.out.println("rotateRight");
        int[][] testSquarelotron = {{25,16,11,6,1},{22,7,8,9,2},{19,12,13,14,3},{24,17,18,23,4},{20,21,15,10,5}};
        Squarelotron testFlip = new Squarelotron(5);
        testFlip.squarelotron = testSquarelotron;
        assertEquals(testFlip, game.upsideDownFlip(3));
        
    }

    /**
     * Test of main method, of class Squarelotron.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Squarelotron.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
