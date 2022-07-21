package ru.netology.Radioman.service;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;


    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {


        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}
