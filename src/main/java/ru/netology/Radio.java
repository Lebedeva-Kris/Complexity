package ru.netology;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 9 && currentRadioStation >= 1) {
            currentRadioStation++;
        } else if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }
}
