package javaapplication1.model;


public class SongList
{
    private String composer;

    private String songID;

    private String title;

    private String albumId;

    private String imageUrl;

    private String path;

    private String artist;

    public String getComposer ()
    {
        return composer;
    }

    public void setComposer (String composer)
    {
        this.composer = composer;
    }

    public String getSongID ()
    {
        return songID;
    }

    public void setSongID (String songID)
    {
        this.songID = songID;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getAlbumId ()
    {
        return albumId;
    }

    public void setAlbumId (String albumId)
    {
        this.albumId = albumId;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getPath ()
    {
        return path;
    }

    public void setPath (String path)
    {
        this.path = path;
    }

    public String getArtist ()
    {
        return artist;
    }

    public void setArtist (String artist)
    {
        this.artist = artist;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [composer = "+composer+", songID = "+songID+", title = "+title+", albumId = "+albumId+", imageUrl = "+imageUrl+", path = "+path+", artist = "+artist+"]";
    }
}
