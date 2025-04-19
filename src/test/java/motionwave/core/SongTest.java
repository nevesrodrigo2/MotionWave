package motionwave.core;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for the Song class.
 * 
 * @author nevesrodrigo2 (Rodrigo Neves)
 */
public class SongTest { 

    private Song song = SongFactory.INSTANCE.createSong("src\\main\\resources\\wash away\\08 - hello euphoria - outside.flac");
 
    @Test 
    public void nameTest() {
        assertEquals("outside", song.getSongName());
    }

    @Test
    public void artistTest() {
        assertEquals("hello euphoria", song.getArtistName());
    }

    @Test
    public void albumTest() {
        assertEquals("wash away", song.getAlbumName());
    }

    @Test
    public void genreTest() {
        assertEquals("", song.getGenre());
    } 

    @Test
    public void yearTest() {
        assertEquals(2023, song.getYear());
    }
    
    @Test
    public void durationTest() {
        assertEquals(0,song.getDuration().getHours());
        assertEquals(1,song.getDuration().getMinutes ());
        assertEquals(41,song.getDuration().getSeconds());
        assertEquals("01:41", song.getDuration().toString());
    }

    @Test
    public void trackNumberTest() {
        assertEquals(8, song.getTrackNumber());
    } 

    @Test
    public void fileTypeTest() {
        assertEquals("Flac", song.getFileType());
    }
} 
   