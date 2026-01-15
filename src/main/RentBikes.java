/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.Bike;
import model.Client;
import model.Employee;
import model.Rent;

/**
 *
 * @author JoseAlbertoPortugalO
 */
public class RentBikes {
    
    private Employee employee;
    
    private ArrayList<Client> clients;
    private ArrayList<Bike> bikes;

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    public void setBikes(ArrayList<Bike> bikes) {
        this.bikes = bikes;
    }

    /**
     * Get the value of employee
     *
     * @return the value of employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Set the value of employee
     *
     * @param employee new value of employee
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert employee name");
        
        
        
        
    }

    
}
