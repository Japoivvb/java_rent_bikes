/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JoseAlbertoPortugalO
 */
public class Rent {
    
    private Bike bike;
    private int hours;
    private double price;

    /**
     * Get the value of price
     *
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the value of price
     *
     * @param price new value of price
     */
    public void setPrice(double price) {
        this.price = price;
    }


    /**
     * Get the value of hours
     *
     * @return the value of hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Set the value of hours
     *
     * @param hours new value of hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    

    /**
     * Get the value of bike
     *
     * @return the value of bike
     */
    public Bike getBike() {
        return bike;
    }

    /**
     * Set the value of bike
     *
     * @param bike new value of bike
     */
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    
}
