/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportModel;

/**
 *airplane class contains only one method of move, it is base class of vehicle and is implementing the interface IMove
 * @author Hp
 */
public class airplane extends vehicle implements IAirplaneMove {
    
    //This function is implemented from the interface Move
    @Override
    public void move(){
        IAirplaneMove.super.move();
    }    
}
