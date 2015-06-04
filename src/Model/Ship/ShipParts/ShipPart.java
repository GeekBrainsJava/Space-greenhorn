package Model.Ship.ShipParts;

/**
 * Created by Anna Gulidova on 31.05.2015 in Space-greenhorn.
 */
public abstract class ShipPart {


    private int size_x;
    private int size_y;
    private int strength;

    public ShipPart(){
        Defaults();
    }

    public ShipPart(int[] xy){
        size_x=xy[0];
        size_y=xy[1];
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    private void Defaults(){
        size_x=1;
        size_y=2;
    }

    public int getSize_x() {
        return size_x;
    }
    public void setSize_x(int size_x) {
        this.size_x = size_x;
    }

    public int getSize_y() {
        return size_y;
    }

    public void setSize_y(int size_y) {
        this.size_y = size_y;
    }


    abstract public void onFire();
}
