package motionwave.interfaces;

/**
 * Represents a music library that contains albums and songs.
 * Provides methods to manage albums and retrieve album details.
 */
public interface IMusicLibrary extends Iterable<IAlbum> {

    /**
     * Imports all albums from a certain directory provided. The directory must not
     * be a file. If the directory has different albums it will import all it can
     * find.
     * 
     * @param directory the directory provided
     * @requires directory.isDirectory
     */
    public void importAlbums(String directory);

    /**
     * Removes an album from the library if it exists. If an album is removed, then
     * it's also removed from other playlists it's in.
     * 
     * @param album the album to be removed
     * 
     */
    public void removeAlbum(IAlbum album);

    /**
     * Adds a song to the library. If the song is already in the library, nothing is
     * added. If it is not then it's added and the respective album is also added.
     * 
     * @param filePath file path to the song file
     * @return true if the song was removed, false otherwise.
     */
    public boolean addSong(String filePath);

    /**
     * Removes a song from the library.
     * 
     * @param song the song to be removed
     */
    public void removeSong(ISong song);

    /**
     * Returns an iterable of all the albums in the library.
     * 
     * @return iterable of all the albums
     */
    public Iterable<IAlbum> getAlbums();

    /**
     * Returns an album if it matches the name and the artist name.
     * 
     * @param albumName  album name
     * @param artistName artist name
     * @return the album if it exists in the library
     */
    public IAlbum getAlbum(String albumName, String artistName);

    /**
     * Returns an iterable of all the songs in a certain album, if the album is in
     * the library.
     * 
     * @param albumName  album name
     * @param artistName artist name
     * @return iterable of the songs from an album
     */
    public Iterable<ISong> getSongs(String albumName, String artistName);
}
