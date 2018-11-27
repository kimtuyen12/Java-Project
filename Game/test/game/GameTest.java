/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tuyen Pham
 */
public class GameTest {
    
    public GameTest() {
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
     * Test of computerMove method, of class Game.
     */
    @Test
    public void testComputerMove() {
        System.out.println("computerMove");
        
        String s = Game.computerMove() + "";
        
        assertTrue("KBGV".contains(s));
        assertFalse("XDR".contains(s));
        assertFalse("ANCX".contains(s));
        assertFalse("ACD".contains(s));
        assertFalse ("UXTT".contains(s));
        
       
    }  
    /**
     * Test of whoWon method, of class Game.
     */
    @Test
    public void testWhoWon() {
        System.out.println("whoWon");
        
        assertEquals("You lose", Game.whoWon("Grönby", "Knoppäng"));
        assertEquals("You won", Game.whoWon("Knoppäng", "Grönby"));
        assertEquals("You won", Game.whoWon("Knoppäng", "Björnarp"));
        assertEquals("You won", Game.whoWon("Grönby","Vilshult"));
        assertEquals("You lose", Game.whoWon("Vilshult", "Grönby"));
       
    }
    
}
