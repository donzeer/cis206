/*
 File: Main.java
 Description: This program creates and manages Mountain objects and instances,
 given their information such as name, country, and elevation in feet and meters. Additionally
 it finds the mountain with the most minimum elevation.
 Created: Thurs. June 8th, 2023, 11:35:00
 Author: Donzeé Riley
 email: donzeer4526@student.vvc.edu
*/

import java.util.ArrayList;

class Mountain {
    private String name;
    private String country;
    private int elevation;
    
    // Initialize Mountain object with name, country, and elevation
    public Mountain(String name, String country, int elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    // Retrieve and establish the names, countries, and elevations of each mountain 
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getElevation() {
        return elevation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public double toMeters() {
        return elevation / 3.2808;
    }
}

public class Main {
    public static void main(String[]args) {
        // Create an ArrayList to store Mountain objects
        ArrayList<Mountain> mountains = new ArrayList<>();
        
        // Create Mountain objects with respective data and add them to the ArrayList
        Mountain chimborazo = new Mountain ("Chimborazo", "Ecuador", 20549);
        Mountain matterhorn = new Mountain ("Matterhorn", "Switzerland", 14692);
        Mountain olympus = new Mountain ("Olympus", "Greece (Macedonia)", 9573);
        Mountain everest = new Mountain ("Everest", "Nepal", 29029);
        Mountain mountMarcy = new Mountain ("Mount Marcy - Adirondacks", "United States", 5344);
        Mountain mountMitchell = new Mountain ("Mount Mitchell - Blue Ridge", "United States", 6684);
        Mountain zugspitze = new Mountain ("Zugspitze", "Switzerland", 9719);

        mountains.add(chimborazo);
        mountains.add(matterhorn);
        mountains.add(olympus);
        mountains.add(everest);
        mountains.add(mountMarcy);
        mountains.add(mountMitchell);
        mountains.add(zugspitze);
 
        // Find and print mountain with the shortest elevation
        minElevation(mountains);

        // Iterate over the mountains ArrayList and print the details of each mountain
        for (Mountain mountain : mountains) {
            System.out.println("Name: " + mountain.getName());
            System.out.println("Country: " + mountain.getCountry());
            System.out.println("Elevation (feet): " + mountain.getElevation());
            System.out.println("Elevation (meters): " + mountain.toMeters());
            System.out.println();
        }
    }

    // Find the mountain with the shortest elevation and print its details
    public static void minElevation (ArrayList<Mountain> mountains) {
        Mountain shortestMountain = mountains.get(0);
        for (Mountain mountain : mountains) {
            if (mountain.getElevation() < shortestMountain.getElevation()) {
                shortestMountain = mountain;
            }
        }
        System.out.println("Shortest Mountain: " + shortestMountain.getName());
        System.out.println("Elevation (feet): " + shortestMountain.getElevation());
        System.out.println("Elevation (meters): " + shortestMountain.toMeters());
        System.out.println();
    }
}