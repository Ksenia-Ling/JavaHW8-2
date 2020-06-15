package ru.netology.Radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {

    private int currentStation = 5;
    private int maxStationNumber = 10;
    private int minStationNumber = 0;

    private int volume = 50;
    private int maxVolume = 100;
    private int minVolume = 0;

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