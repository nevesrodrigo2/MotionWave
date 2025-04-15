package motionwave.core;

import java.util.ArrayList;
import java.util.Iterator;

import motionwave.interfaces.IAlbum;
import motionwave.interfaces.IMusicLibrary;
import motionwave.interfaces.ISong;

public class MusicLibrary implements IMusicLibrary {

    ArrayList<IAlbum> albums;

    public MusicLibrary() {
        this.albums = new ArrayList<>();
    }

    @Override
    public void importAlbums(String filePath) {
        
    }

    @Override
    public void removeAlbum(IAlbum album) {
        if(albums.contains(album))
            albums.remove(album);
    }

    @Override
    public boolean addSong(String filePath, String albumName, String artistName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addSong'");
    }

    @Override
    public void removeSong(String songName, String albumName, String artistName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeSong'");
    }

    @Override
    public Iterable<IAlbum> getAlbums() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlbums'");
    }

    @Override
    public IAlbum getAlbum(String albumName, String artistName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlbum'");
    }

    @Override
    public Iterable<ISong> getSongs(String albumName, String artistName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSongs'");
    }

    @Override
    public Iterator<IAlbum> iterator() {
        return albums.iterator();
    }
    
}
