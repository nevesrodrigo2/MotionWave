package motionwave.core;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Song song = (Song) SongFactory.INSTANCE.createSong("wash away\\01 - hello euphoria - fall is not so far away anymore .flac");
        System.out.println(song.getSongName());
    }
}
 