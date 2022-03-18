package com.example.baitapdonut;

public class Donut {

    private String nameDonut;
    private String decribetion;
    private String cost;
    private int piture;

    public Donut() {
    }

    public Donut(String nameDonut, String decribetion, String cost, int piture) {
        this.nameDonut = nameDonut;
        this.decribetion = decribetion;
        this.cost = cost;
        this.piture = piture;
    }

    public void setNameDonut(String nameDonut) {
        this.nameDonut = nameDonut;
    }

    public void setDecribetion(String decribetion) {
        this.decribetion = decribetion;
    }


    public void setPiture(int piture) {
        this.piture = piture;
    }

    public String getNameDonut() {
        return nameDonut;
    }

    public String getDecribetion() {
        return decribetion;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getPiture() {
        return piture;
    }


}


