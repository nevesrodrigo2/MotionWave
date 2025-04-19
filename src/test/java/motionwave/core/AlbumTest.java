package motionwave.core;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test class for the Album class.
 * 
 * * @author nevesrodrigo2 (Rodrigo Neves)
 */
public class AlbumTest {

    private Song song = SongFactory.INSTANCE
            .createSong("src\\main\\resources\\wash away\\08 - hello euphoria - outside.flac");
    private Album album = new Album(song.getAlbumName(), song.getArtistName(), 0, song.getGenre(), song.getYear());

    @Test
    public void titleTest() {
        assertEquals(song.getAlbumName(), album.getAlbumName());
    }

    @Test
    public void artistTest() {
        assertEquals(song.getArtistName(), song.getArtistName());
    }

    @Test
    public void yearTest() {
        assertEquals(song.getYear(), album.getYear());
    }

    @Test
    public void genreTest() {
        assertEquals(song.getGenre(), album.getGenre());
    }

    @Test
    public void numberOfTracksTest() {
        assertEquals(0, album.getNumberOfTracks());
    }

    @Test
    public void addSongTest() {
        assertTrue(album.addSong(song));
    }

    @Test
    public void addDuplicateSongTest() {
        assertTrue(album.addSong(song)); // Adding the same song again should return false
        assertFalse(album.addSong(song)); // Adding the same song again should return false
    }

    @Test
    public void addSongNumberOfTracksTest() {
        assertTrue(album.addSong(song));
        assertEquals(1, album.getNumberOfTracks());
    }

    @Test
    public void removeSongTest() {
        assertTrue(album.addSong(song));
        assertEquals(1, album.getNumberOfTracks());
        album.removeSong(song);
        assertEquals(0, album.getNumberOfTracks());
    }

    @Test
    public void removeNonExistentSongTest() {
        assertTrue(album.addSong(song));
        assertEquals(1, album.getNumberOfTracks());
        album.removeSong(new Song("NonExistentSong", "NonExistentArtist", "NonExistentAlbum", "NonExistentArtist", "NonExistentGenre" ,0, null, 0, "NonExistentGenre"));
        assertEquals(1, album.getNumberOfTracks()); // Number of tracks should remain the same
    }
}
  