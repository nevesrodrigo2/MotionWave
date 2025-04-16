package motionwave.interfaces;

import motionwave.core.Duration;

/**
 * Represents an album in a music library.
 * Provides methods to manage songs and retrieve album details.
 */
public interface IAlbum extends Iterable<ISong> {

    /**
     * Adds a song to the album using the file path. The song is successfully added
     * if it's respective album (from the metadata) is this album.
     *
     * @param filePath The file path of the song to add.
     * @return true if the song was successfully added, false otherwise.
     */
    public boolean addSong(String filePath);

    /**
     * Removes a song from the album by its name.
     *
     * @param songName The name of the song to remove.
     */
    public void removeSong(ISong songName);

    /**
     * Gets the name of the album.
     *
     * @return The album name.
     */
    public String getAlbumName();

    /**
     * Gets the name of the artist for the album.
     *
     * @return The artist name.
     */
    public String getArtistName();

    /**
     * Gets the release year of the album.
     *
     * @return The release year.
     */
    public int getYear();

    /**
     * Gets the number of tracks in the album.
     *
     * @return The number of tracks.
     */
    public int getNumberOfTracks();

    /**
     * Gets the genre of the album.
     *
     * @return The genre.
     */
    public String getGenre();

    /**
     * Gets the total duration of the album.
     *
     * @return The duration as a string.
     */
    public Duration getDuration();

    /**
     * Gets all the songs in the album.
     *
     * @return An iterable collection of songs in the album.
     */
    public Iterable<ISong> getSongs();

    /**
     * Retrieves a specific song from the album by its name.
     *
     * @param songName The name of the song to retrieve.
     * @return The song with the specified name, or null if not found.
     */
    public ISong getSong(String songName);
}
