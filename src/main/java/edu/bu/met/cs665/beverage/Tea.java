/**
 * Name: HungHsu(Allen) Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/14/2024
 * File Name: Tea.java
 * Description: This class is responsible for the methods and attributes of a Tea.
 */
package edu.bu.met.cs665.beverage;

/**
 * This is the Tea class.
 * This class is responsible for representing a Tea.
 */
public class Tea extends Beverage{
    private String leaf;

    /**
     * Create a tea object using the price, name, and leaf.
     *
     * @param price price of the tea as double
     * @param name  name of the tea as String
     * @param leaf leaf of the tea as String
     */
    public Tea(double price, String name, String leaf) {
        this(price, name, "", leaf);
    }

    /**
     * Create a tea object using the price, name, description, and leaf.
     *
     * @param price price of the tea as double
     * @param name  name of the tea as String
     * @param desc description of the tea as String
     * @param leaf leaf of the tea as String
     */
    public Tea(double price, String name, String desc, String leaf) {
        super(price, name, desc);
        this.leaf = leaf;
    }

    /**
     * Getter method for leaf.
     * 
     * @return the leaf of the tea
     */
    public String getLeaf() {
        return leaf;
    }

    /**
     * Setter method for leaf.
     *
     * @param leaf leaf of the tea
     */
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }
}
