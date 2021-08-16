package battleship_eclipse;
/**
 * the blueprint for ships belonging to the players fleet
 */
public class Ship{

    private String shipClass;//the name of the ship class
    private int shipLength; //the length of the ship
    private int[][] shipLocation = new int[shipLength][];
    //the coordinate array representing the ships location.  The ship's length will equal the length of the location array


    public Ship (String shipClass, int shipLength) {
        this.shipClass = shipClass;
        this.shipLength = shipLength;
    }

    //Getters

    public int getShipLength() {
        return shipLength;
    }

    public int[][] getShipLocation() {
        return shipLocation;
    }

    public String getShipClass() {
        return shipClass;
    }

    //Setters

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public void setShipLength(int shipLength) {
        this.shipLength = shipLength;
    }

    public void setShipLocation(int[][] shipLocation) {
        this.shipLocation = shipLocation;
    }
}