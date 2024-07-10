/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description: Within this abstract class represents a WalkBehindMower, a type of Mower with specific properties such as cut width
 and wheel diameter. It serves as a blueprint for managing walk-behind mowers, encapsulating common characteristics and behaviors.
 By extending the Mower class, it inherits generic mower attributes, providing a structured approach for handling walk-behind mower instances.
 */
public abstract class WalkBehindMower extends Mower {
    // Private instance variables to store cut width and wheel diameter of the walk-behind mower
    private double cutWidth;
    private double wheelDiameter;

    // Default constructor with no parameters
    public WalkBehindMower() {
    }

    // Parameterized constructor to initialize WalkBehindMower object with provided values
    public WalkBehindMower(double cutWidth, double wheelDiameter, String manufacturer, int year, String serialNumber) {
        super(manufacturer, year, serialNumber); // Call to superclass constructor to initialize inherited properties
        this.cutWidth = cutWidth;
        this.wheelDiameter = wheelDiameter;
    }

    // Accessor methods to get cut width and wheel diameter
    public double getCutWidth() {
        return cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    // Mutator methods to set cut width and wheel diameter
    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    // Override toString method to represent WalkBehindMower object as a string
    @Override
    public String toString() {
        return super.toString() + "\n" + // Calling toString method of superclass to get manufacturer, year, and serial number
                cutWidth + "\n" +
                wheelDiameter;
    }
}
