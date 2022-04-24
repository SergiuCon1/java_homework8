package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int countRadioStation = 10;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentRadioStation;
    private int minSoundVolume;
    private int maxSoundVolume;
    private int currentSoundVolume;

    public Radio(int countRadioStation, int maxSoundVolume) {
        this.countRadioStation = countRadioStation;
        this.maxSoundVolume = maxSoundVolume;
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
