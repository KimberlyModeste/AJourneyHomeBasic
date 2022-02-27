package edu.cuny.csi.csc330.project;

public class Item {
    private String name;
    private String description;
    private int cost;


    //Item(){}

    Item(String name, String description, int cost){
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
