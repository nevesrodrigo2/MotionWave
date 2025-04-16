package motionwave.core;

import motionwave.interfaces.ISong;
import motionwave.core.Duration;

public class Song implements ISong{

    private String filepath;
    private String title;
    private String album;
    private String artist;
    private String genre;
    private int year;
    private Duration duration;
    private int trackNumber;
    private String fileType;

    public Song (String filepath, String title, String album, String artist, String genre, int year, Duration duration, int trackNumber, String fileType) {
        this.filepath = filepath;
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.trackNumber = trackNumber;
        this.fileType = fileType;
    }
    @Override
    public String getFilePath() {
        return filepath;
    }

    @Override
    public String getSongName() {
        return title;
    }

    @Override
    public String getAlbumName() {
        return album;
    }

    @Override
    public String getArtistName() {
        return artist;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Duration getDuration() {
        return duration;
    }

    @Override
    public int getTrackNumber() {
        return trackNumber;
    }

    @Override
    public String getFileType() {
        return fileType;
    }
    
}
