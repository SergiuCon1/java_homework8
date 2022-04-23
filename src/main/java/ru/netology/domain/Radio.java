package ru.netology.domain;

public class Radio {

    private int countRadioStation = 10;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentRadioStation;
    private int minSoundVolume;
    private int maxSoundVolume;
    private int currentSoundVolume;

    public Radio() {

    }

    public Radio(int countRadioStation, int maxSoundVolume) {
        this.countRadioStation = countRadioStation;
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        this.maxRadioStation = countRadioStation - 1;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        this.currentRadioStation++;
        setCurrentRadioStation(currentRadioStation);
    }

    public void prevRadioStation() {
        this.currentRadioStation--;
        setCurrentRadioStation(currentRadioStation);
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxSoundVolume) {
            currentSoundVolume = maxSoundVolume;
        }
        if (currentSoundVolume < minSoundVolume) {
            currentSoundVolume = minSoundVolume;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void increaseCurrentSoundVolume() {
        this.currentSoundVolume++;
        setCurrentSoundVolume(currentSoundVolume);
    }

    public void decreaseCurrentSoundVolume() {
        this.currentSoundVolume--;
        setCurrentSoundVolume(currentSoundVolume);
    }
}
