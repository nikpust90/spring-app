package ru.maxima.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Random;

@Getter
@Data
@AllArgsConstructor
public class RadioStation {
    public String nameStation;
    public List<Track> tracks;

    public Track randomTrack() {
        Random rand = new Random();
        return tracks.get(rand.nextInt(tracks.size()));
    }
}
