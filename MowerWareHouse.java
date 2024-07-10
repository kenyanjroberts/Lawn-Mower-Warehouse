/*
 Name: Kenyan Roberts
 Class: Comp167
 Section: 003
 Date: 3/24/2024
 Description: This class represents a MowerWareHouse which manages a collection of mowers. It includes properties such as
 store name and an ArrayList to store Mower objects. The class provides methods to add, remove, get, and set mowers
 in the warehouse, facilitating the management of mower inventory. Then toString() method is overridden to provide
 a string representation of the MowerWareHouse object, including details about the store name and each mower
 contained in the warehouse.
 */
import java.util.ArrayList;

public class MowerWareHouse {
    // Private instance variables to store the store name and the list of mowers
    private String storeName;
    private ArrayList<Mower> mowers;

    // Default constructor to initialize the ArrayList of mowers
    public MowerWareHouse() {
        mowers = new ArrayList<>();
    }

    // Accessor methods to get and set the store name
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    // Method to get the number of mowers in the warehouse
    public int getNumMowers() {
        return mowers.size();
    }

    // Method to add a mower to the warehouse
    public void addMower(Mower mower) {
        mowers.add(mower);
    }

    // Method to remove a mower from the warehouse by index
    public void removeMower(int index) {
        mowers.remove(index);
    }

    // Method to get a mower from the warehouse by index
    public Mower getMower(int index) {
        return mowers.get(index);
    }

    // Method to set a mower in the warehouse by index
    public void setMower(int index, Mower mower) {
        mowers.set(index, mower);
    }

    // Override toString method to represent MowerWareHouse object as a string
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(storeName).append("\n"); // Append store name first
        for (Mower mower : mowers) {
            result.append(mower.toString()).append("\n"); // Append each mower's details
        }
        return result.toString().trim(); // this trims any trailing whitespace before returning
    }
}
