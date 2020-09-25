/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportModel;

/**
 *
 * @author Hp
 */
public interface IAirplaneMove {
    public default void move(){
        System.out.println("Move by flying");
    }
}
