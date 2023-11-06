/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++; 
        id = count; // Assign the next ID to this Product
        
        features = new ArrayList<Feature>(); // Initialize the ArrayList
    }

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

   
    public int getId() {
        return id;
    }
    
    public int getPrice() {
        return price;
    }

    // Setter for the product price
    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }

    
    public ArrayList<Feature> getFeatures() {
        return features;
    }

   
    public Feature addNewFeature(String name, Object value) {
        Feature newFeature = new Feature(this, name, value);
        features.add(newFeature);
        return newFeature;
    }

    
}
