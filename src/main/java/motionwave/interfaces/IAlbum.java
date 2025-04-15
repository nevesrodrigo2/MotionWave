package motionwave.interfaces;

public interface IAlbum {

    public boolean addSong(String filePath);

    public void removeSong(String songName);

    public String getAlbumName();

    public String getArtistName();

    public int getYear();

    public int getNumberOfTracks();

    public String getGenre();

    public String getDuration();

    public Iterable <ISong> getSongs();

    public ISong getSong(String songName);
}

