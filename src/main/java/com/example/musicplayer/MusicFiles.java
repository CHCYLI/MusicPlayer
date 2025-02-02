package com.example.musicplayer;

public class MusicFiles {
    private String path;
    private String title;
    private String artist;
    private String duration;
    private String album;

    public MusicFiles(String path, String title, String artist, String duration, String album) {
        this.path = path;
        this.album = album;
        this.artist = artist;
        this.duration = duration;
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public  MusicFiles() {

    }
}
