package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void increaseStationNumber() {
        Radio radio = new Radio();
        radio.nextStationButton();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void increaseStationNumberOverMax() {
        Radio radio = new Radio(8, 9, 0, 50, 100, 0);
        radio.nextStationButton();
        radio.nextStationButton();
        radio.nextStationButton();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void decreaseStationNumber() {
        Radio radio = new Radio(7, 9, 0, 50, 100, 0);
        radio.prevStationButton();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void decreaseStationNumberUnderMin() {
        Radio radio = new Radio(0, 9, 0, 50, 100, 0);
        radio.prevStationButton();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        assertEquals(51, radio.getVolume());
    }

    @Test
    public void increaseVolumeOverMax() {
        Radio radio = new Radio(0, 9, 0, 99, 100, 0);
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        assertEquals(49, radio.getVolume());
    }

    @Test
    public void decreaseVolumeUnderMin() {
        Radio radio = new Radio(0, 9, 0, 1, 100, 0);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
}