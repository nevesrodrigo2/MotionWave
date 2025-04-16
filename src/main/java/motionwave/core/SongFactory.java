package motionwave.core;

import java.io.File;
import java.io.IOException;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

import motionwave.interfaces.ISong;

public enum SongFactory {
    INSTANCE;

    public ISong createSong(String filepath) {
        File file = new File(filepath);
        AudioFile audioFile;
        try {
            System.out.println("Reading file: " + filepath);
            audioFile = AudioFileIO.read(file);
            Tag audioTag = audioFile.getTag();
            String title = audioTag.getFirst(FieldKey.TITLE);
            String album = audioTag.getFirst(FieldKey.ALBUM);
            String artist = audioTag.getFirst(FieldKey.ARTIST);
            String genre = audioTag.getFirst(FieldKey.GENRE);
            int year = Integer.parseInt(audioTag.getFirst(FieldKey.YEAR));
            int duration = audioFile.getAudioHeader().getTrackLength();
            Duration songDuration = new Duration(duration);
            int trackNumber = Integer.parseInt(audioTag.getFirst(FieldKey.TRACK));
            String fileType = audioFile.getAudioHeader().getFormat();
            
            return new Song(filepath, title, album, artist, genre, year, songDuration, trackNumber, fileType);
        } catch (CannotReadException | IOException | TagException | ReadOnlyFileException
                | InvalidAudioFrameException e) {
            e.printStackTrace();
        }
        return null;
    }

}
