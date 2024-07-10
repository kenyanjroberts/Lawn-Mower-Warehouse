/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/16/2024
 Description: This class represents the Engine object with properties such as manufacturer,
 horsepower, and number of cylinders. It provides a default constructor, a parameterized
 constructor, accessor methods to get and set the values of the properties, and a toString
 method to represent the Engine object as a string.
 */
public class Engine {
    // Private instance variables to store the manufacturer, horsepower, and number of cylinders
    private String manufacturer;
    private double hoursePower;
    private int cylinders;

    // Default constructor with no parameters
    public Engine() {
    }

    // Parameterized constructor to initialize the Engine object with provided values
    public Engine(String manufacturer, double hoursePower, int cylinders) {
        this.manufacturer = manufacturer;
        this.hoursePower = hoursePower;
        this.cylinders = cylinders;
    }

    // Accessor method to get the manufacturer of the engine
    public String getManufacturer() {
        return manufacturer;
    }

    // Mutator method to set the manufacturer of the engine
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Accessor method to get the horsepower of the engine
    public double getHoursePower() {
        return hoursePower;
    }

    // Mutator method to set the horsepower of the engine
    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    // Accessor method to get the number of cylinders in the engine
    public int getCylinders() {
        return cylinders;
    }

    // Mutator method to set the number of cylinders in the engine
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    // toString method to represent the Engine object as a string
    @Override
    public String toString() {
        return   manufacturer + "\n" +
                hoursePower + "\n" +
                cylinders;
    }
}
