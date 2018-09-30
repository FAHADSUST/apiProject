package javaapplication1.model;


public class MonthList
{
    private String albumName;

    private String songListRange;

    private String albumID;

    private SongList[] songList;

    public String getAlbumName ()
    {
        return albumName;
    }

    public void setAlbumName (String albumName)
    {
        this.albumName = albumName;
    }

    public String getSongListRange ()
    {
        return songListRange;
    }

    public void setSongListRange (String songListRange)
    {
        this.songListRange = songListRange;
    }

    public String getAlbumID ()
    {
        return albumID;
    }

    public void setAlbumID (String albumID)
    {
        this.albumID = albumID;
    }

    public SongList[] getSongList ()
    {
        return songList;
    }

    public void setSongList (SongList[] songList)
    {
        this.songList = songList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [albumName = "+albumName+", songListRange = "+songListRange+", albumID = "+albumID+", songList = "+songList+"]";
    }
}
