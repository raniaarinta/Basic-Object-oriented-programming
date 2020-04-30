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
public class Truck extends Vehicle {
    
    private double cargo_volume;
    public Truck(String serial,String model, String year, double price, double cargo_volume)
    {
         super(serial, model, year, price);
        this.cargo_volume=cargo_volume;
    }

    /**
     * @return the cargo_volume
     */
    public double getCargo_volume() {
        return cargo_volume;
    }

    /**
     * @param cargo_volume the cargo_volume to set
     */
    public void setCargo_volume(double cargo_volume) {
        this.cargo_volume = cargo_volume;
    }
    
    public void load_cargo()
    {
        System.out.println("load cargo on the Trunk");
        System.out.println("total cargo: "+getCargo_volume());
        
    }
}
