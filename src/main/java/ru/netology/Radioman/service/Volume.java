package ru.netology.Radioman.service;

public class Volume {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {

        return currentVolume;

    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }


    public Volume(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public Volume(int size) {
        maxVolume = minVolume + size;
    }


    public void setCurrentVolume(int newCurretVolume) {

        currentVolume = newCurretVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
