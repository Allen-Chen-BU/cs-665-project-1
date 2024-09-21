package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.condiment.Condiment;

/**
 * Unit test for testing condiment
 */
public class TestCondiment {
  public TestCondiment() {}

  @Test
  public void TestEquals() {
    Condiment condiment = new Condiment("Milk", 0.5);
    assertEquals(condiment, new Condiment("Milk", 0.5));
  }
}
