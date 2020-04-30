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
public class Vehicle {
    
    private String serial_number;
    private String model;
    private String year_manufactured;
    private double price; 
    
    public Vehicle(String serial,String model, String year, double price)
    {
        serial_number=serial;
        this.model=model;
        year=year_manufactured;
        this.price=price;
    }

    /**
     * @return the serial_number
     */
    public String getSerial_number() {
        return serial_number;
    }

    /**
     * @param serial_number the serial_number to set
     */
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year_manufactured
     */
    public String getYear_manufactured() {
        return year_manufactured;
    }

    /**
     * @param year_manufactured the year_manufactured to set
     */
    public void setYear_manufactured(String year_manufactured) {
        this.year_manufactured = year_manufactured;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void start_engine()
    {
         System.out.println("turn the key to start the engine ");
    }
    public void stop_engine()
    {
        System.out.println("turn the key to stop the engine ");
    }
}
