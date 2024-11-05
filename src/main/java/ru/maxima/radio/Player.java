package ru.maxima.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Getter
@Data
@AllArgsConstructor
public class Player {
    private List<RadioStation> radioStations;

    public void play() {
        for (RadioStation radioStation1 : radioStations) {
            Track track = radioStation1.randomTrack();
            System.out.println("Играет радиостанция: " + radioStation1.getNameStation() + " Трек: " + track.getName());
        }
    }

}
