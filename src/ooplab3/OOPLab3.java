/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab3;

import java.time.LocalDate;
import transportModel.airplane;
import transportModel.car;
import transportModel.ship;
import transportModel.vehicle;

/**
 *This is the main class for running all the functions
 * @author Awais
 */
public class OOPLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printVehicleDetails pv=new printVehicleDetails();//For printing the vehicle details
        
        //Creating instance of Car and assigning the values, then running the move function
        car cr=new car();
        cr.setName("Car 1");
        cr.setWeight(200);
        cr.setReleaseDate(LocalDate.now());
        pv.printVechileDetails(cr);
        cr.move();
        System.out.println("--------------");
        
        //Creating instance of Airplane and assigning the values, then running the move function
        airplane ap=new airplane();
        ap.setName("Airplane 1");
        ap.setWeight(2000);
        ap.setReleaseDate(LocalDate.now());
        pv.printVechileDetails(ap);
        ap.move();
        System.out.println("--------------");
 
        //Creating instance of Ship and assigning the values, then running the move function
        ship sp=new ship();
        sp.setName("Ship 1");
        sp.setWeight(5000);
        sp.setReleaseDate(LocalDate.now());
        pv.printVechileDetails(sp);
        sp.move();
    }
    
}
