package com.example.android.goodnewsapp;

public class News {

    private String mSection;
    private String mTitle;
    private String mDate;
    private String mUrl;

    public News(String Section, String Title, String Date, String Url){
        mSection = Section;
        mTitle = Title;
        mDate = Date;
        mUrl = Url;

    }

    public String getmSection() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl(){
        return mUrl;
    }
}
