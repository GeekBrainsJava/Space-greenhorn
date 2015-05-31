package Model;

/**
 * Created by Anna Gulidova on 31.05.2015 in Space-greenhorn.
 */
abstract class ShipParts {
    private int size_x;
    private int size_y;

    public ShipParts(){
        Defaults();
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
}
