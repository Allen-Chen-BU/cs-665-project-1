/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {
    Main main = new Main();
    main.doIt();
  }

  /**
   * This method test the vending machine.
   *
   * @return String
   */
  private void doIt() {
    VendingMachine vendingMachine = new VendingMachine();
    for (String name : vendingMachine.getBeverageMenu()) {
      System.out.println(name);
    }
    for (String name : vendingMachine.getCondimentMenu()) {
      System.out.println(name);
    }
    vendingMachine.selectBeverage("Black Tea");
    vendingMachine.selectCondiment("Milk", 2);
    vendingMachine.selectCondiment("Sugar", 1);
    System.out.println(vendingMachine.getPrice());
  }

}
