package javaapplication1.model;

public class MyPojo
{
    private AlbumList[] albumList;

    public AlbumList[] getAlbumList ()
    {
        return albumList;
    }

    public void setAlbumList (AlbumList[] albumList)
    {
        this.albumList = albumList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [albumList = "+albumList+"]";
    }
}

