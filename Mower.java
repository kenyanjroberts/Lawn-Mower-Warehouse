/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/224024q
 Description: This abstract class represents a Mower object with properties such as manufacturer, year, and serial number.
 It serves as a blueprint for creating various types of mowers within the system. The class provides constructors and
 accessor/mutator methods to manage these properties, enabling the creation and manipulation of Mower objects.
 The toString() method is overridden to provide a string representation of a Mower object, including details about its
 manufacturer, year, and serial number.
 */

public abstract class Mower {
    // Private instance variables to store the manufacturer, year, and serial number of the mower
    private String manufacturer;
    private int year;
    private String serialNumber;

    // Default constructor with no parameters
    public Mower() {
    }

    // Parameterized constructor to initialize the Mower object with provided values
    public Mower(String manufacturer, int year, String serialNumber) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }

    // Accessor method to get the manufacturer of the mower
    public String getManufacturer() {
        return manufacturer;
    }

    // Mutator method to set the manufacturer of the mower
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Accessor method to get the year of the mower
    public int getYear() {
        return year;
    }

    // Mutator method to set the year of the mower
    public void setYear(int year) {
        this.year = year;
    }

    // Accessor method to get the serial number of the mower
    public String getSerialNumber() {
        return serialNumber;
    }

    // Mutator method to set the serial number of the mower
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // toString method to represent the Mower object as a string
    @Override
    public String toString() {
        return  manufacturer + "\n" + // Concatenating manufacturer
                year + "\n" + // Concatenating year
                serialNumber + "\n" + // Concatenating serial number
                "#"; // Adding a special character to signify the end of the Mower details
    }
}
