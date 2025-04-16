package motionwave.core;

import java.util.ArrayList;
import java.util.Iterator;

import motionwave.interfaces.IAlbum;
import motionwave.interfaces.ISong;

public class Album implements IAlbum {
    private String title;
    private String artist;
    private int numberOfTracks;
    private String genre;
    private int year;
    private Duration totalDuration;

    private ArrayList <ISong> songs;

    public Album (String title, String artist, int numberOfTracks, String genre, int year) {
        this.title = title;
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
        this.genre = genre;
        this.year = year;
        this.songs = new ArrayList<>();

    }

    @Override
    public boolean addSong(String filePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSong'");
    }

    @Override
    public void removeSong(ISong songName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeSong'");
    }

    @Override
    public String getAlbumName() {
        return title;
    }

    @Override
    public String getArtistName() {
        return artist;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public Duration getDuration() {
        return totalDuration;
    }

    @Override
    public Iterable<ISong> getSongs() {
        return songs;
    }

    @Override
    public ISong getSong(String songName) {
        for (ISong song : songs) {
            if (song.getSongName().equalsIgnoreCase(songName)) {
                return song;
            }
        }
        return null; // or throw an exception if preferred
    }

    @Override
    public Iterator<ISong> iterator() {
        return songs.iterator();
    }

    /**
     * Sets the duration of the album by summing up the durations of all songs in the album.
     * This method should be called whenever a song is added or removed from the album.
     * 
     */
    private void setDuration() {
        int totalDuration = 0;
        for(ISong song : songs) {
            totalDuration += song.getDuration().getTotalSeconds();
        }
        this.totalDuration = new Duration(totalDuration);
    }
}
