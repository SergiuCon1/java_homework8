package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(30);

    @Test
    @DisplayName("Получение текущей радиостанции")
    public void shouldGetCurrentRadioStation() {

        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Установка радиостанции №20")
    public void shouldSetRadioStation() {
        radio.setCurrentRadioStation(20);

        int expected = 20;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на следующую радиостанцию")
    public void shouldSetNextRadioStation() {

        radio.setCurrentRadioStation(28);
        radio.nextRadioStation();

        int expected = 29;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на предыдущую радиостанцию")
    public void shouldSetPrevRadioStation() {

        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    @DisplayName("Переключение радиостанции с номера 29 на номер 0")
    public void shouldSetNextRadioStationToMin() {

        radio.setCurrentRadioStation(29);
        radio.nextRadioStation();

        int expected = 0;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение радиостанции с номера 0 на номер 29")
    public void shouldSetPrevRadioStationToMax() {

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 29;

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Получение текущей громкости звука")
    public void shouldGetCurrentSoundVolume() {

        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Установка громкости звука на 100")
    public void shouldSetCurrentSoundVolume() {

        radio.setCurrentSoundVolume(100);

        int expected = 100;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Установка громкости звука на 150")
    public void shouldSetCurrentSoundVolumeMoreThanOneHundred() {

        radio.setCurrentSoundVolume(150);

        int expected = 100;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Увеличение громкости на один")
    public void shouldIncreaseCurrentSoundVolume() {

        radio.setCurrentSoundVolume(99);
        radio.increaseCurrentSoundVolume();

        int expected = 100;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Уменьшение громкости на один")
    public void shouldDecreaseCurrentSoundVolume() {

        radio.setCurrentSoundVolume(1);
        radio.decreaseCurrentSoundVolume();

        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Увеличение громкости больше чем максимальной")
    public void shouldIncreaseCurrentSoundVolumeMoreThanMax() {

        radio.setCurrentSoundVolume(100);
        radio.increaseCurrentSoundVolume();

        int expected = 100;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    @Test
    @DisplayName("Уменьшение громкости меньше минимальной")
    public void shouldDecreaseCurrentSoundVolumeLessThanMin() {

        radio.setCurrentSoundVolume(0);
        radio.decreaseCurrentSoundVolume();

        int expected = 0;

        assertEquals(expected, radio.getCurrentSoundVolume());
    }

    Radio radioOne = new Radio();

    @Test
    @DisplayName("Установка радиостанции №5, когда количество радиостанций равно 10")
    public void shouldSetRadioStationFive() {
        radioOne.setCurrentRadioStation(5);

        int expected = 5;

        assertEquals(expected, radioOne.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на следующую радиостанцию, когда количество радиостанций равно 10")
    public void shouldSetNextRadioStationTenStation() {

        radioOne.setCurrentRadioStation(8);
        radioOne.nextRadioStation();

        int expected = 9;

        assertEquals(expected, radioOne.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение на предыдущую радиостанцию, когда количество радиостанций равно 10")
    public void shouldSetPrevRadioStationTenStation() {

        radioOne.setCurrentRadioStation(1);
        radioOne.prevRadioStation();

        int expected = 0;

        assertEquals(expected, radioOne.getCurrentRadioStation());
    }


    @Test
    @DisplayName("Переключение радиостанции с номера 9 на номер 0, когда количество радиостанций равно 10")
    public void shouldSetNextRadioStationToMinTenStation() {

        radioOne.setCurrentRadioStation(9);
        radioOne.nextRadioStation();

        int expected = 0;

        assertEquals(expected, radioOne.getCurrentRadioStation());
    }

    @Test
    @DisplayName("Переключение радиостанции с номера 0 на номер 9, когда количество радиостанций равно 10")
    public void shouldSetPrevRadioStationToMaxTenStation() {

        radioOne.setCurrentRadioStation(0);
        radioOne.prevRadioStation();

        int expected = 9;

        assertEquals(expected, radioOne.getCurrentRadioStation());
    }
}