/**
 * Name: HungHsu(Allen) Chen
 * Course: CS-665 Software Designs & Patterns
 * Date: 09/14/2024
 * File Name: VendingMachine.java
 * Description: This class is responsible for the methods and 
 *              attributes of a Beverage Vending Machine.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.Coffee;
import edu.bu.met.cs665.beverage.Tea;
import edu.bu.met.cs665.condiment.Condiment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the Condiment class.
 * This class is responsible for representing a beverage vending machine.
 */
public class VendingMachine {
    // Types of Coffee in the machine
    private final String[] COFFEE_NAMES = new String[] {"Espresso", "Americano", "Latte Macchiato"};
    private final Map<String, Double> COFFEE_PRICES = new HashMap<String, Double>() {{
        put("Espresso", 4.7);
        put("Americano", 2.62);
        put("Latte Macchiato", 3.65);
    }};
    private final Map<String, String> COFFEE_BEAN = new HashMap<String, String>() {{
        put("Espresso", "Arabica");
        put("Americano", "Arabica");
        put("Latte Macchiato", "Arabica");
    }};
    private final Map<String, String> COFFEE_DESC = new HashMap<String, String>() {{
        put("Espresso", "Concentrate Coffee");
        put("Americano", "Espresso with water");
        put("Latte Macchiato", "Espresso with milk");
    }};

    // Types of tea in machine
    private final String[] TEA_NAMES = new String[] {"Black Tea", "Green Tea", "Yellow Tea"};
    private final Map<String, Double> TEA_PRICES = new HashMap<String, Double>() {{
        put("Black Tea", 5.75);
        put("Green Tea", 3.99);
        put("Yellow Tea", 5.0);
    }};
    private final Map<String, String> TEA_LEAF = new HashMap<String, String>() {{
        put("Black Tea", "Camellia sinensis assamica");
        put("Green Tea", "Camellia sinensis");
        put("Yellow Tea", "Camellia sinensis");
    }};
    private final Map<String, String> TEA_DESC = new HashMap<String, String>() {{
        put("Black Tea", "A smoky and fruity tea");
        put("Green Tea", "A tea");
        put("Yellow Tea", "A lightly oxidized tea");
    }};

    // Types of condiments in machine
    private final String[] CONDIMENT_NAMES = new String[] {"Milk", "Sugar"};
    private final Map<String, Double> CONDIMENT_PRICES = new HashMap<String, Double>() {{
        put("Milk", 0.5);
        put("Sugar", 0.5);
    }};
    public static final int CONDIMENT_LIMIT = 3;

    private ArrayList<Beverage> beverages = new ArrayList<Beverage>();
    private ArrayList<Condiment> condiments = new ArrayList<Condiment>();

    private Beverage beverageBuying;
    private Map<Condiment, Integer> condimentsBuying = new HashMap<Condiment, Integer>();

    /**
     * Create a vending machine with the beverage and condiments.
     */
    public VendingMachine() {
        super();
        // add coffee to the machine
        for (String coffeeName : COFFEE_NAMES) {
            Coffee coffee = new Coffee(
                COFFEE_PRICES.get(coffeeName), 
                coffeeName, 
                COFFEE_DESC.get(coffeeName), 
                COFFEE_BEAN.get(coffeeName)
            );
            beverages.add(coffee);
        }
        // add tea to the machine
        for (String teaName : TEA_NAMES) {
            Tea tea = new Tea(
                TEA_PRICES.get(teaName), 
                teaName, 
                TEA_DESC.get(teaName), 
                TEA_LEAF.get(teaName)
            );
            beverages.add(tea);
        }
        // add condiments
        for (String condimentName : CONDIMENT_NAMES) {
            Condiment condiment = new Condiment(condimentName, CONDIMENT_PRICES.get(condimentName));
            condiments.add(condiment);
        }
    }

    /**
     * Select a beverage from the vending machine.
     * 
     * @param beverageName a string that represent the name of a beverage
     */
    public void selectBeverage(String beverageName) {
        try {
            for (Beverage beverage : beverages) {
                if (beverageName == beverage.getName()) {
                    beverageBuying = beverage;
                }
            }

            if (beverageBuying == null) {
                throw new Exception("Beverage not in the machine");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Select a condiment from the vending machine.
     * 
     * @param condimentName a string that represent the name of a condiment
     * @param unit how many unit of condiment is wanted (max = 3)
     */
    public void selectCondiment(String condimentName, int unit) {
        try {
            if (unit < 1 || unit > CONDIMENT_LIMIT) {
                throw new Exception("condiment unit outside of range");
            }

            for (Condiment condiment : condiments) {
                if (condimentName == condiment.getName()) {
                    condimentsBuying.put(condiment, unit);
                }
            }

            if (beverageBuying == null) {
                throw new Exception("Condiment not in the machine");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Get the price from the selceted beverage and condiments.
     * 
     * @return the total price of selected beverage and condiments
     */
    public double getPrice() {
        double result = 0;

        try {
            if (beverageBuying == null) { throw new Exception("No beverage selected"); }

            result += beverageBuying.getPrice();

            for (Condiment condiment : condimentsBuying.keySet()) {
                result += condiment.getPrice() * condimentsBuying.get(condiment);
            }
        } catch (Exception e) {
            // just through a warning
            System.out.println(e.getMessage());
        }

        return result;
    }

    /**
     * Get all beverage's names that the machine is selling.
     * 
     * @return an array of string that represent the beverage's names
     */
    public String[] getBeverageMenu() {
        String[] result = new String[COFFEE_NAMES.length + TEA_NAMES.length];
        System.arraycopy(COFFEE_NAMES, 0, result, 0, COFFEE_NAMES.length);
        System.arraycopy(TEA_NAMES, 0, result, COFFEE_NAMES.length, TEA_NAMES.length);
        return result;
    }

    /**
     * Get all condiment's names that the machine is selling.
     * 
     * @return an array of string that represent the condiment's names
     */
    public String[] getCondimentMenu() {
        String[] result = new String[CONDIMENT_NAMES.length];
        System.arraycopy(CONDIMENT_NAMES, 0, result, 0, CONDIMENT_NAMES.length);
        return result;
    }

    /**
     * Getter method for beverageBuying.
     * 
     * @return the name of beverage selecting
     */
    public String getBeverageBuying() {
        return beverageBuying.getName();
    }

    /**
     * Getter method for condimentsBuying.
     * 
     * @return the condiments selecting
     */
    public Map<String, Integer> getCondimentsBuying() {
        Map<String, Integer> result = new HashMap<String,Integer>() {{
            for(Condiment condiment: condimentsBuying.keySet()) {
                put(condiment.getName(), condimentsBuying.get(condiment));
            }
        }};
        return result;
    }
}
