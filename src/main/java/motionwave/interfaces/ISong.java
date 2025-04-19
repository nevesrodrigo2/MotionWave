package motionwave.interfaces;

import motionwave.core.Duration;

/**
 * Represents a song in a music library.
 * Provides methods to retrieve song details and metadata.
 * 
 * @author nevesrodrigo2 (Rodrigo Neves)
 */
public interface ISong {

    /**
     * Gets the file path of the song.
     *
     * @return The file path of the song.
     */
    public String getFilePath();

    /**
     * Gets the name of the song.
     *
     * @return The name of the song.
     */
    public String getSongName();

    /**
     * Gets the name of the album the song belongs to.
     *
     * @return The album name.
     */
    public String getAlbumName();

    /**
     * Gets the name of the artist of the song.
     *
     * @return The artist name.
     */
    public String getArtistName();

    /**
     * Gets the genre of the song.
     *
     * @return The genre of the song.
     */
    public String getGenre();

    /**
     * Gets the release year of the song.
     *
     * @return The release year.
     */
    public int getYear();

    /**
     * Gets the duration of the song.
     *
     * @return The duration.
     */
    public Duration getDuration();


    /**
     * Gets the track number of the song in the album.
     *
     * @return The track number.
     */
    public int getTrackNumber();

    /**
     * Gets the file type of the song.
     *
     * @return The file type of the song.
     */
    public String getFileType();

}