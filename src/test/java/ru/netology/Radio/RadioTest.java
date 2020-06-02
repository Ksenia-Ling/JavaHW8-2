package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void increaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStationButton();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);

    }

    @Test
    public void increaseStationNumberOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStationButton();
        radio.nextStationButton();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

    @Test
    public void decreaseStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStationButton();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }
    @Test
    public void decreaseStationNumberUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStationButton();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected,actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void increaseVolumeOverMax() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.decreaseVolume();
        int expected = 7;
        int actual = radio.getVolume();
        assertEquals(expected,actual);
    }
    @Test
    public void decreaseVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected,actual);
    }
}