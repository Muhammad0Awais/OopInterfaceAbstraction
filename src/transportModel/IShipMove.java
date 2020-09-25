/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportModel;

/**
 *This is the interface for implementing the new functionality Move
 * @author Hp
 */
public interface IShipMove {
    public default void move(){
        System.out.println("Move by swimming/floating");
    }
}
