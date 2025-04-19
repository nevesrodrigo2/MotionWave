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

    private ArrayList<ISong> songs;

    public Album(String title, String artist, int numberOfTracks, String genre, int year) {
        this.title = title;
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
        this.genre = genre;
        this.year = year;
        this.songs = new ArrayList<>();

    }

    @Override
    public boolean addSong(ISong song) {

        if (song != null && !songs.contains(song)) {
            songs.add(song);
            numberOfTracks++;
            setDuration(); // Update the total duration of the album
            return true;
        }
        return false; // Song was not added (either null or already exists in the album)
    }

    @Override
    public void removeSong(ISong song) {
        if (songs.contains(song)) {
            songs.remove(song);
            numberOfTracks--;
            setDuration(); // Update the total duration of the album
        }
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
        return null;
    }

    @Override
    public Iterator<ISong> iterator() {
        return songs.iterator();
    }

    /**
     * Sets the duration of the album by summing up the durations of all songs in
     * the album.
     * This method should be called whenever a song is added or removed from the
     * album.
     * 
     */
    private void setDuration() {
        int totalDurationTime = 0;
        for (ISong song : songs) {
            totalDurationTime += song.getDuration().getTotalSeconds();
        }
        this.totalDuration = new Duration(totalDurationTime);
    }
}
