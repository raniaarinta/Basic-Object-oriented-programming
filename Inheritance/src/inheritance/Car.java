/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author USER
 */
public class Car extends Vehicle {
    
    private int pasanger_value;
    
    public Car(String serial,String model, String year, double price, int pasanger)
    {
        super(serial, model, year, price);
        pasanger_value=pasanger;
        
    }

    /**
     * @return the pasanger_value
     */
    public int getPasanger_value() {
        return pasanger_value;
    }

    /**
     * @param pasanger_value the pasanger_value to set
     */
    public void setPasanger_value(int pasanger_value) {
        this.pasanger_value = pasanger_value;
    }
    
    public void load_pasanger()
    {
        System.out.println("load pasanger on the back seat");
        System.out.println("total passanger: "+getPasanger_value());
        
    }
    
}
