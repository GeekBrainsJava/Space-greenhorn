package Model.Ship.ShipParts;


/**
 * Created by Anna Gulidova on 02.06.2015 in Space-greenhorn.
 */
public class Engine extends ShipPart {
    private int speed;
    private int energy;

    public Engine(){
        super(new int[]{2,2});
        Default();
    }

    public Engine(int speed){
        setSpeed(speed);
    }

    private void Default(){
        setSpeed(100);
        setEnergy(1);
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }




    @Override
    public void onFire() {

    }
}
