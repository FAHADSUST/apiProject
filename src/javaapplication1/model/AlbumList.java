package javaapplication1.model;

public class AlbumList
{
    private MonthList[] monthList;

    private String yearID;

    private String yearName;

    public MonthList[] getMonthList ()
    {
        return monthList;
    }

    public void setMonthList (MonthList[] monthList)
    {
        this.monthList = monthList;
    }

    public String getYearID ()
    {
        return yearID;
    }

    public void setYearID (String yearID)
    {
        this.yearID = yearID;
    }

    public String getYearName ()
    {
        return yearName;
    }

    public void setYearName (String yearName)
    {
        this.yearName = yearName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [monthList = "+monthList+", yearID = "+yearID+", yearName = "+yearName+"]";
    }
}
