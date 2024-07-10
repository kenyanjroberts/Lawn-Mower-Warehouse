/*Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description:
 This class represents a CommercialMower which extends the Mower class and includes additional properties
 specific to commercial mowers such as operating hours, zero turn radius, model, deck width, and engine.
 It provides constructors and accessor/mutator methods to manage these properties, enabling the creation
 and manipulation of CommercialMower objects. The toString() method is overridden to provide a string
 representation of a CommercialMower object, including details about its manufacturer, year, serial number,
 engine, model, deck width, operating hours, and zero turn radius.
 */

public class CommercialMower extends Mower {
    // Private instance variables to store operating hours, zero turn radius, model, deck width, and engine
    private double operatingHours;
    private boolean zeroTurnRadius;
    private String model;
    private double deckWidth;
    private Engine engine;

    // Default constructor
    public CommercialMower() {
        // Default constructor with no parameters
    }

    // Parameterized constructor to initialize CommercialMower object with provided values
    public CommercialMower(double operatingHours, boolean zeroTurnRadius, String manufacturer, int year, String serialNumber) {
        super(manufacturer, year, serialNumber); // Call to superclass constructor to initialize inherited properties
        this.operatingHours = operatingHours;
        this.zeroTurnRadius = zeroTurnRadius;
    }

    // Accessor methods to get operating hours and zero turn radius
    public double getOperatingHours() {
        return operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    // Mutator methods to set operating hours, zero turn radius, model, deck width, and engine
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDeckWidth(double width) {
        this.deckWidth = width;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Getter methods to get model, deck width, and engine
    public String getModel() {
        return model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public Engine getEngine() {
        return engine;
    }

    // Override toString method to represent CommercialMower object as a string
    @Override
    public String toString() {
        return getManufacturer() + "\n" + // Concatenating manufacturer,year,serialNumber,engine,model,deckwidth,operatingHours,and zeroTurnRadius
                getYear() + "\n" +
                getSerialNumber() + "\n" + "C\n" +
                engine + "\n" +
                model + "\n" +
                deckWidth + "\n" +
                operatingHours + "\n" +
                zeroTurnRadius;
    }
}
