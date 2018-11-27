/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package southieaccent;

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
public class SouthieAccentTest {
   

    /**
     * Test of replace method, of class SouthieAccent.
     */
    @Test
    public void testReplace() {
        
        assertEquals("hohroh", SouthieAccent.replace("horror"));
        assertEquals("wateh", SouthieAccent.replace("water"));
        assertEquals("pictuhe", SouthieAccent.replace("picture"));
        assertEquals("cuhtain", SouthieAccent.replace("curtain"));
        assertEquals("undehsea", SouthieAccent.replace("undersea"));

    }

    /**
     * Test of append method, of class SouthieAccent.
     */
    @Test
    public void testAppend() {
        
        assertEquals("tunar", SouthieAccent.append("tuna"));
        assertEquals("Cubar", SouthieAccent.append("Cuba"));
        assertEquals("idear", SouthieAccent.append("idea"));
        assertEquals("undersear", SouthieAccent.append("undersea"));
        assertEquals("a", SouthieAccent.append("a"));
        
    }

    /**
     * Test of replaceWord method, of class SouthieAccent.
     */
    @Test
    public void testReplaceWord() {
       
        assertEquals("wicked small", SouthieAccent.replaceWord("very small"));
        assertEquals("wicked tight", SouthieAccent.replaceWord("very tight"));
        assertEquals("wicked much", SouthieAccent.replaceWord("very much"));
        assertEquals("wicked few", SouthieAccent.replaceWord("very few"));
        
    }

    /**
     * Test of exception1 method, of class SouthieAccent.
     */
    @Test
    public void testException1() {
       
        assertEquals("beeyah", SouthieAccent.exception1("beer"));
        assertEquals("cheeyah", SouthieAccent.exception1("cheer"));
        assertEquals("veeyah", SouthieAccent.exception1("veer"));
        assertEquals("aiyah", SouthieAccent.exception1("air"));
        assertEquals("haiyah", SouthieAccent.exception1("hair"));
        
    }

    /**
     * Test of exception2 method, of class SouthieAccent.
     */
    @Test
    public void testException2() {
        
       assertEquals("doowah", SouthieAccent.exception2("door"));
       assertEquals("floowah", SouthieAccent.exception2("floor"));
       assertEquals("moowah", SouthieAccent.exception2("moor"));
       assertEquals("Poowah", SouthieAccent.exception2("Poor"));
        
    }
    
    @Test
    public void testConvert(){
        
         assertEquals("wicked doowah", SouthieAccent.convert("very door"));
         assertEquals("wicked deeyah", SouthieAccent.convert("very deer"));
         assertEquals("wicked hahd", SouthieAccent.convert("very hard"));
         assertEquals("left cah key by the hahboh in Cubar", SouthieAccent.convert("left car key by the harbor in Cuba"));
         assertEquals("deeyah", SouthieAccent.convert("deer"));
        
    }
    
}
