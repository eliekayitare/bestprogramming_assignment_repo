/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Theophile
 */
public class Pizza implements Serializable{
    private String name;
    private double basePrize;
    private OptionSet optionSet;
    private String size;
    private double deliveryFee;

    public Pizza() {
    }

    public Pizza(String name, double basePrize, OptionSet optionSet, String size, double deliveryFee) {
        this.name = name;
        this.basePrize = basePrize;
        this.optionSet = optionSet;
        this.size = size;
        this.deliveryFee = deliveryFee;
    }

   

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrize() {
        return basePrize;
    }

    public void setBasePrize(double basePrize) {
        this.basePrize = basePrize;
    }

    public OptionSet getOptionSet() {
        return optionSet;
    }

    public void setOptionSet(OptionSet optionSet) {
        this.optionSet = optionSet;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name=" + name + ", basePrize=" + basePrize + ", optionSet=" + optionSet + ", size=" + size + ", deliveryFee=" + deliveryFee + '}';
    }

  
    
    
}
