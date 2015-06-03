package Model.Ship.ShipParts;


/**
 * Created by Anna Gulidova on 02.06.2015 in Space-greenhorn.
 */
public class Engine extends ShipPart {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void onFire() {

    }
}
