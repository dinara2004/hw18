package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Sheep[] sheeps;
    private Horse[] horses;
    private Cow[] cows;

    public Farm() {
    }

    public Farm(String address, String ownerName, Sheep[] sheeps, Horse[] horses, Cow[] cows) {
        this.address = address;
        this.ownerName = ownerName;
        this.sheeps = sheeps;
        this.horses = horses;
        this.cows = cows;
    }

    public Farm(String s, String dinara, Sheep[] sheepsF1, Sheep[] sheepsF2, Cow[] cowsF1, Cow[] cowsF2, Horse[] horsesF1, Horse[] horsesF2) {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    @Override
    public String toString() {

        return "Farm information: " +'\n' +
                "address: " + address + '\n' +
                "ownerName: " + ownerName + '\n' +
                "sheep: " + sheeps.length +'\n'+
                Arrays.toString(sheeps) +'\n' +
                "horses: " + horses.length +'\n'+
                Arrays.toString(horses) +'\n' +
                "cows: " + cows.length+'\n'+
                Arrays.toString(cows) +'\n';
    }
}
