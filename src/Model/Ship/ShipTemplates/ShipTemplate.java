package Model.Ship.ShipTemplates;

import Model.Ship.ShipParts.*;

/**
 * Created by Anna Gulidova on 03.06.2015 in Space-greenhorn.
 */
abstract public class ShipTemplate {
    public ShipPart[] shipParts;

    public ShipTemplate(){
        shipParts=new ShipPart[]{new Cockpit(),new Engine(),new Stores()};
    }
}
