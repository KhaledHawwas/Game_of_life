/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.util.Arrays;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 *
 * @author Khaled
 */
public class NormalRuleNGTest {

    public NormalRuleNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testNormalRule() {
        NormalRule r = new NormalRule("rule", "234/345");
        boolean s[] = new boolean[]{false, false, true, true, true, false, false, false, false};
        boolean c[] = new boolean[]{false, false, true, true, true, false, false, false, false};
        assertEquals(r.getSurvivalRule(), s, "s");
        assertEquals(r.getCreatRule(), c, "creatRule");

    }

    /**
     * Test of setRule method, of class NormalRule.
     */
    @Test
    public void testSetRule() {
    }

    /**
     * Test of isLive method, of class NormalRule.
     */
    @Test
    public void testIsLive() {
    }

    /**
     * Test of getName method, of class NormalRule.
     */
    @Test
    public void testGetName() {
    }

}
