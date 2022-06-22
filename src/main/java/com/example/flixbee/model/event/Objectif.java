package com.example.flixbee.model.event;

import java.util.ArrayList;

public class Objectif {

    private String description;
    private ArrayList<String> important;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getImportant() {
        return important;
    }

    public void setImportant(ArrayList<String> important) {
        this.important = important;
    }
}
