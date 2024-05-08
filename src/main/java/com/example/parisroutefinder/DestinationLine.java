package com.example.parisroutefinder;

import java.util.ArrayList;
import java.util.List;

public class DestinationLine {
    // The name of the line
    private String lineName;
    // The lineColor of the line
    private String lineColor;
    // A list of stations on the line
    private List<Destination> destinations;

    public DestinationLine(String lineName, String color) {
        // Initialize the line with a name and lineColor
        this.lineName = lineName;
        this.lineColor = color;
        // Initialize the list of stations as an empty ArrayList
        this.destinations = new ArrayList<>();
    }

    public String getLineName() {
        // Get the name of the line
        return lineName;
    }

    public String getLineColor() {
        // Get the lineColor of the line
        return lineColor;
    }

    public List<Destination> getStations() {
        // Get the list of stations on the line
        return destinations;
    }

    public void addStation(Destination destination) {
        // Add a station to the line by adding it to the list of stations
        this.destinations.add(destination);
        destination.addLine(this);// add this line to the station
    }

}
