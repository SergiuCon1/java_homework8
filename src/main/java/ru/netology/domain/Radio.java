package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentSoundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
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

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 10) {
            currentSoundVolume = 10;
        }
        if (currentSoundVolume < 0) {
            currentSoundVolume = 0;
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
