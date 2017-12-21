package com.example.samsung.notepadder;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note implements Serializable {
    private long mDateTime;
    private String mTitle;
    private String mContent;

    public Note(long mDateTime, String mTitle, String mContent) {
        this.mDateTime = mDateTime;
        this.mTitle = mTitle;
        this.mContent = mContent;
    }

    public void setmDateTime(long mDateTime) {
        this.mDateTime = mDateTime;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public long getmDateTime() {
        return mDateTime;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmContent() {
        return mContent;
    }
    public String getDateTimeFormatted(Context context)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy , hh:mm:ss",context.getResources().getConfiguration().locale);
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(mDateTime));

    }
    /* public Note(long datetime,String title,String content)
        {
            mDateTime = datetime;
            mTitle=title;
            mContent=content;
        }
    public void setmContent(String content)
    {
        mContent=content;
    }
    public void setmDateTime(long dateTime)
    {
        mDateTime=dateTime;
    }
    public void setmTitle(String title)
    {
        mTitle=title;
    }
    public long getmDateTime(){
        return mDateTime;
    }
    public String getmTitle()
    {
        return mTitle;
    }
    public String getmContent(){
        return mContent;
    }
    public String getDateTimeFormatted(Context context)
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy hh/mm/ss",context.getResources().getConfiguration().locale);
        sdf.getTimeZone(TimeZone.getDefault());
        return sdf.format(new Date(mDateTime));
    }*/
}