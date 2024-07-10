/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description: This class represents a PushReelMower which extends the WalkBehindMower class and includes additional properties
 specific to push reel mowers such as the number of wheels. It provides constructors, accessor, and mutator methods to manage
 the number of wheels for the push reel mower. The toString() method is overridden to provide a string representation of
 a PushReelMower object, including details about its manufacturer, year, serial number, cut width, wheel diameter, and
 the number of wheels.
 */
public class PushReelMower extends WalkBehindMower {
    private int numWheels;

    // Default constructor
    public PushReelMower() {
    }

    // Parameterized constructor to initialize PushReelMower object with provided values
    public PushReelMower(int numWheels, double cutWidth, double wheelDiameter, String manufacturer, int year, String serialNumber) {
        super(cutWidth, wheelDiameter, manufacturer, year, serialNumber); // Call superclass constructor to initialize inherited properties
        this.numWheels = numWheels;
    }

    // Accessor method to get the number of wheels
    public int getNumWheels() {
        return numWheels;
    }

    // Mutator method to set the number of wheels
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    // Override toString method to represent PushReelMower object as a string
    @Override
    public String toString() {
        return getManufacturer() + "\n" + // Concatenating manufacturer (inherited from Mower)
                getYear() + "\n" + // Concatenating year (inherited from Mower)
                getSerialNumber() + "\n" + "P\n" + // Concatenating serial number and indicating it's a PushReelMower
                getCutWidth() + "\n" + // Concatenating cut width (inherited from WalkBehindMower)
                getWheelDiameter() + "\n" +
                numWheels;
    }
}





