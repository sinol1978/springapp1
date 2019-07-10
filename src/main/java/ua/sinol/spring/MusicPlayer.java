package ua.sinol.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;

    private String volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> musicList){
        this.musicList = musicList;
    }



    public void playMusic(){
        for(Music item : musicList){
            System.out.println("Playing: " + item.getSong());
        }
    }

    public void setMusicList(List <Music> musicList) {
        this.musicList = musicList;
    }
}
