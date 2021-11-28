package com.company;

public class Newspaper {
    private String name;
    private int year;
    private int month;
    int dayOfMonth;
    boolean isFinnish;

    public Newspaper (String name, int year, int month, int dayOfMonth, boolean isFinnish)
    {
        this.name = name;
        this.year= year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.isFinnish = isFinnish;
    }

    public String toString ()
    {
        StringBuffer strBuffer = new StringBuffer ();
//        int numAuth = name.length();
//        for (int i = 0; i < numAuth; i = i + 1)
        strBuffer.append (name);
        strBuffer.append (" - " + "("+ dayOfMonth + "/" + "");
        strBuffer.append (month + "/");
        strBuffer.append (year + ")" + " - " + " ");
        strBuffer.append("Finnish: " + isFinnish);

        return strBuffer.toString ();
    }
    public String getName ()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth ()
    {
        return month;
    }

    public int getDayOfMonth ()
    {
        return dayOfMonth;
    }

    public boolean getisFinnish ()
    {
        return isFinnish ;
    }

}
