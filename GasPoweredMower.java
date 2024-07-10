/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description: This class represents a GasPoweredMower which extends the WalkBehindMower class and includes additional
 properties specific to gas-powered mowers such as engine and self-propelled status. It provides constructors and accessor/mutator
 methods to manage these properties, enabling the creation and manipulation of GasPoweredMower objects. The toString()
 method is overridden to provide a string representation of a GasPoweredMower object, including details about its
 manufacturer, year, serial number, engine, cut width, wheel diameter, and self-propelled status.
 */


public class GasPoweredMower extends WalkBehindMower {
    // Private instance variables to store engine and self-propelled status of the gas-powered mower
    private Engine engine;
    private boolean selfPropelled;

    // Default constructor with no parameters
    public GasPoweredMower() {
    }

    // Accessor methods to get engine and self-propelled status
    public Engine getEngine() {
        return engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    // Mutator methods to set engine and self-propelled status
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }

    // Override toString method to represent GasPoweredMower object as a string
    @Override
    public String toString() {
        return getManufacturer() + "\n" + // Concatenating manufacturer,year,SerialNumber,cutwidth, and wheeldiameter
                getYear() + "\n" +
                getSerialNumber() + "\n" + "G\n" +
                getCutWidth() + "\n" +
                getWheelDiameter() + "\n" +
                engine + "\n" +
                selfPropelled;
    }
}
