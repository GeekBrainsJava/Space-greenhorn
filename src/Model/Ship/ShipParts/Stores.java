package Model.Ship.ShipParts;

/**
 * Created by Anna Gulidova on 03.06.2015 in Space-greenhorn.
 */
public class Stores extends ShipPart{
    private int size;
    private int countStorage;

    public int getCountStorage() {
        return countStorage;
    }

    public void setCountStorage(int countStorage) {
        this.countStorage = countStorage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void onFire() {

    }
}
