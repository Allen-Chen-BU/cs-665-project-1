/**
 * Name: HungHsu(Allen) Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/14/2024
 * File Name: Beverage.java
 * Description: This class is responsible for the methods and attributes of a Beverage.
 */

package edu.bu.met.cs665.beverage;

/**
 * This is the Beverage class.
 * This class is responsible for representing a Beverage.
 */
public class Beverage {
    private double price;
    private String name;
    private String desc;

    /**
     * Create a Beverage object using the price, name.
     *
     * @param price price of the beverage as double
     * @param name  name of the beverage as String
     */
    public Beverage(double price, String name) {
        this(price, name, "");
    }

    /**
     * Create a Beverage object using the price, name and description.
     *
     * @param price price of the beverage as double
     * @param name  name of the beverage as String
     * @param desc description of the beverage as String
     */
    public Beverage(double price, String name, String desc) {
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    /**
     * Getter method for price.
     * 
     * @return the price of the beverage
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter method for price.
     *
     * @param price price of the beverage
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter method for name.
     * 
     * @return the name of the beverage
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param name name of the beverage
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for description.
     * 
     * @return the description of the beverage
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for description.
     *
     * @param desc description of the beverage
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
