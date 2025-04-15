package motionwave.interfaces;

public interface IMusicLibrary extends Iterable <IAlbum> {

    public void importAlbums(String filePath);

    public void removeAlbum(IAlbum album);

    public boolean addSong(String filePath, String albumName, String artistName);

    public void removeSong(String songName, String albumName, String artistName);

    public Iterable<IAlbum> getAlbums();

    public IAlbum getAlbum(String albumName, String artistName);

    public Iterable<ISong> getSongs(String albumName, String artistName);
}
