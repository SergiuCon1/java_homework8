package ru.netology.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    @DisplayName("Получение текущей радиостанции")
    public void shouldGetCurrentRadioStation() {
        Radio radio = new Radio();

        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Установка радиостанции №5")
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на следующую радиостанцию")
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();

        int expected = 6;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на предыдущую радиостанцию")
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();

        int expected = 4;

        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    @DisplayName("Переключение радиостанции с номера 9 на номер 0")
    public void shouldSetNextRadioStationToMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение радиостанции с номера 0 на номер 9")
    public void shouldSetPrevRadioStationToMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Получение текущей громкости звука")
    public void shouldGetCurrentSoundVolume() {
        Radio radio = new Radio();

        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Установка громкости звука на 4")
    public void shouldSetCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(4);

        int expected = 4;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Увеличение громкости на один")
    public void shouldIncreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(5);
        radio.increaseCurrentSoundVolume();

        int expected = 6;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Уменьшение громкости на один")
    public void shouldDecreaseCurrentSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(5);
        radio.decreaseCurrentSoundVolume();

        int expected = 4;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Увеличение громкости больше чем максимальной")
    public void shouldIncreaseCurrentSoundVolumeMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(10);
        radio.increaseCurrentSoundVolume();

        int expected = 10;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Уменьшение громкости меньше минимальной")
    public void shouldDecreaseCurrentSoundVolumeLessThanMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.decreaseCurrentSoundVolume();

        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

}