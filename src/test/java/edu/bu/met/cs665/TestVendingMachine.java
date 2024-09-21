package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for testing vending machine
 */
public class TestVendingMachine {
  private VendingMachine vendingMachine = new VendingMachine();

  public TestVendingMachine() {}

  @Test
  public void TestSelectBeverage() {
    vendingMachine.selectBeverage("Black Tea");
    assertEquals("Black Tea", vendingMachine.getBeverageBuying());
  }

  @Test
  public void TestSelectCondiment() {
    vendingMachine.selectCondiment("Milk", 1);
    assertTrue(vendingMachine.getCondimentsBuying().containsKey("Milk"));
    assertEquals(1, (int) vendingMachine.getCondimentsBuying().get("Milk"));
  }

  @Test
  public void TestGetBeverageMenu() {
    List<String> realMenu = Arrays.asList(vendingMachine.getBeverageMenu());
    List<String> menu = Arrays.asList("Espresso", "Americano", "Latte Macchiato", "Black Tea",
        "Green Tea", "Yellow Tea");
    assertTrue(
        menu.size() == realMenu.size() && menu.containsAll(realMenu) && realMenu.containsAll(menu));
  }
}
