package src.interfaces;

public interface IMusicLibrary {

    public void addAlbum(String albumName, String artistName);

    public void removeAlbum(String albumName, String artistName);

    public void addSong(String filePath, String albumName, String artistName);

    public void removeSong(String songName, String albumName, String artistName);

    public Iterable<IAlbum> getAlbums();

    public IAlbum getAlbum(String albumName, String artistName);

    public Iterable<ISong> getSongs(String albumName, String artistName);
}
