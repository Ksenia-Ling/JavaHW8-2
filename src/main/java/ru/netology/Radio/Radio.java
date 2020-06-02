package ru.netology.Radio;

public class Radio {

    private int currentStation;
    private int maxStationNumber = 9;
    private int minStationNumber = 0;

    private int volume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void nextStationButton() {
        currentStation++;
        if (currentStation > maxStationNumber) {
            currentStation = minStationNumber;
        }
    }

    public void prevStationButton() {
        currentStation--;
        if (currentStation < minStationNumber) {
            currentStation = maxStationNumber;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void increaseVolume() {
        volume++;
        if (volume > maxVolume) {
            volume = maxVolume;
            return;
        }
    }

    public void decreaseVolume() {
        volume--;
        if (volume < minVolume) {
            volume = minVolume;
            return;
        }
    }

}