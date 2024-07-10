/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description:This class represents a LawnTractor, which is a type of Mower. It extends the Mower class and adds
 specific properties such as engine, model, and deck width. The class provides constructors and accessor/mutator
 methods to manage these properties, enabling the creation and manipulation of LawnTractor objects. The toString()
 method is overridden to provide a string representation of a LawnTractor object, including details about its
 manufacturer, year, serial number, engine, model, and deck width.
 */

public class LawnTractor extends Mower {
    // Private instance variables to store the engine, model, and deck width of the lawn tractor
    private Engine engine;
    private String model;
    private double deckWidth;

    // Default constructor with no parameters
    public LawnTractor() {
    }

    // Parameterized constructor to initialize the LawnTractor object with provided values
    public LawnTractor(Engine engine, String model, double deckWidth, String manufacturer, int year, String serialNumber) {
        super(manufacturer, year, serialNumber); // Calls the constructor of the superclass (Mower)
        this.engine = engine;
        this.model = model;
        this.deckWidth = deckWidth;
    }

    // Accessor method to get the engine of the lawn tractor
    public Engine getEngine() {
        return engine;
    }

    // Mutator method to set the engine of the lawn tractor
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // Accessor method to get the model of the lawn tractor
    public String getModel() {
        return model;
    }

    // Mutator method to set the model of the lawn tractor
    public void setModel(String model) {
        this.model = model;
    }

    // Accessor method to get the deck width of the lawn tractor
    public double getDeckWidth() {
        return deckWidth;
    }

    // Mutator method to set the deck width of the lawn tractor
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    // toString method to represent the LawnTractor object as a string
    @Override
    public String toString() {
        return getManufacturer() + "\n" + // Concatenating manufacturer (inherited from Mower)
                getYear() + "\n" + // Concatenating year (inherited from Mower)
                getSerialNumber() + "\n" + // Concatenating serial number (inherited from Mower)
                " L\n" + // Indicating that it's a LawnTractor
                engine.getManufacturer() + "\n" + // Concatenating engine manufacturer
                engine.getHoursePower() + "\n" + // Concatenating engine horsepower
                engine.getCylinders() + "\n" + // Concatenating engine cylinders
                model + "\n" + // Concatenating model
                deckWidth; // Concatenating deck width
    }
}
