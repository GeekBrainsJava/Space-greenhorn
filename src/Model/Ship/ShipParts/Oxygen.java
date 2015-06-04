package Model.Ship.ShipParts;

/**
 * Created by Anna Gulidova on 03.06.2015 in Space-greenhorn.
 */
public class Oxygen extends ShipPart {
    private int power;

    public Oxygen(){
        super();
        Defaults();
    }

    private void Defaults(){
        setPower(0);
    }
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void onFire() {

    }
}
