package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import edu.bu.met.cs665.condiment.Condiment;

/**
 * Unit test for testing vending machine
 */
public class TestVendingMachine {
    private VendingMachine vendingMachine = new VendingMachine();

    public TestVendingMachine() {
        super();
    }

    @Test
    public void TestSelectBeverage(){
        vendingMachine.selectBeverage("Black Tea");
        assertEquals("Black Tea", vendingMachine.getBeverageBuying());
    }

    @Test
    public void TestSelectCondiment(){
        vendingMachine.selectCondiment("Milk", 1);
        assertTrue(vendingMachine.getCondimentsBuying().containsKey("Milk"));
        assertEquals(1, (int) vendingMachine.getCondimentsBuying().get("Milk"));
    }
}
