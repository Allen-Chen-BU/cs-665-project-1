/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/14/2024 
 * File Name: Condiment.java 
 * Description: This class is responsible for the methods and attributes of a Condiment.
 */

package edu.bu.met.cs665.condiment;

/**
 * This is the Condiment class. This class is responsible for representing a Condiment.
 */
public class Condiment {
  private String name;
  private double price;

  /**
   * Create a Condiment object using the price and name.
   *
   * @param price price of the condiment as double
   * @param name name of the condiment as String
   */
  public Condiment(String name, double price) {
    this.name = name;
    this.price = price;
  }

  /**
   * Getter method for name.
   * 
   * @return the name of the condiment
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for name.
   *
   * @param name name of the condiment
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter method for price.
   * 
   * @return the price of the condiment
   */
  public double getPrice() {
    return price;
  }

  /**
   * Setter method for price.
   *
   * @param price price of the condiment
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * To check if the input object equals the condiment.
   * 
   * @param obj object to be checked
   * 
   * @return true if object equals to the condiment
   */
  @Override
  public boolean equals(Object obj) {
    if (super.equals(obj)) {
      return true;
    }
    if (obj != null && this.getClass() == obj.getClass()) {
      Condiment condiment = (Condiment) obj;
      return condiment.name == this.name && condiment.price == this.price;
    }
    return false;
  }
}
