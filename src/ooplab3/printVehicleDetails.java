/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab3;

import transportModel.vehicle;

/**
 *
 * @author Hp
 */
public class printVehicleDetails {
    public void printVechileDetails(vehicle v){
        System.out.println("Name: "+v.getName());
        System.out.println("Weight: "+v.getWeight());
        System.out.println("Release Date: "+v.getWeight());
    }
}
