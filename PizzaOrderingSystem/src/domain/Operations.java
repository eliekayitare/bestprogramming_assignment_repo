/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Theophile
 */
public class Operations implements Serializable{
    private List<Pizza> orderedpizzas = new ArrayList<>();

    public Operations() {
    }

    public List<Pizza> getOrderedpizzas() {
        return orderedpizzas;
    }

    public void setOrderedpizzas(List<Pizza> orderedpizzas) {
        this.orderedpizzas = orderedpizzas;
    }

   public void recordpizza(Pizza pizza){
       orderedpizzas.add(pizza);
   }
   public List<Pizza> allPizzas(List orderedpizzas){
       
       return orderedpizzas;
   }
}
