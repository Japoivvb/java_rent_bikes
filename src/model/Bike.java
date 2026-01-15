/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JoseAlbertoPortugalO
 */
public class Bike {
    
    private String id;
    private String type;
    private boolean available;

    /**
     * Get the value of available
     *
     * @return the value of available
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Set the value of available
     *
     * @param available new value of available
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }


    /**
     * Get the value of type
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the value of type
     *
     * @param type new value of type
     */
    public void setType(String type) {
        this.type = type;
    }

    

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

}
