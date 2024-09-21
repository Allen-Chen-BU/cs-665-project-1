/**
 * Name: HungHsu(Allen) Chen 
 * Course: CS-665 Software Designs & Patterns 
 * Date: 09/14/2024 
 * File Name: Coffee.java 
 * Description: This class is responsible for the methods and attributes of a Coffee.
 */

package edu.bu.met.cs665.beverage;

/**
 * This is the Coffee class. This class is responsible for representing a Coffee.
 */
public class Coffee extends Beverage {
  private String bean;

  /**
   * Create a coffee object using the price, name, and bean.
   *
   * @param price price of the coffee as double
   * @param name name of the coffee as String
   * @param bean bean of the coffee as String
   */
  public Coffee(double price, String name, String bean) {
    this(price, name, "", bean);
  }

  /**
   * Create a coffee object using the price, name, description, and bean.
   *
   * @param price price of the coffee as double
   * @param name name of the coffee as String
   * @param desc description of the coffee as String
   * @param bean bean of the coffee as String
   */
  public Coffee(double price, String name, String desc, String bean) {
    super(price, name, desc);
    this.bean = bean;
  }

  /**
   * Getter method for bean.
   * 
   * @return the bean of the coffee
   */
  public String getBean() {
    return bean;
  }

  /**
   * Setter method for bean.
   *
   * @param bean bean of the coffee
   */
  public void setBean(String bean) {
    this.bean = bean;
  }
}
