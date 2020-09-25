/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportModel;

import java.time.LocalDate;

/**
 *Abstract vehicle base class
 * @author Hp
 */
public abstract class vehicle {
    protected String name;
    protected int weight;
    protected LocalDate releaseDate;

    //Name Getter
    public String getName() {
        return name;
    }

    //Name Setter
    public void setName(String name) {
        assert (!name.isEmpty()):"Name can't be empty";
        this.name = name;
    }

    //weight getter
    public int getWeight() {
        return weight;
    }

    //Weight Setter
    public void setWeight(int weight) {
        assert(weight>=10):"Weight can't be less than 10kg";
        this.weight = weight;
    }

    //Weight Getter
    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    //Weight Setter
    public void setReleaseDate(LocalDate releaseDate) {
        assert releaseDate!=null:"Date can't be null";
        this.releaseDate = releaseDate;
    }
    
    //Basic move function.
    public void move(){
        System.out.println("Base Kind of Move");
    }
}
