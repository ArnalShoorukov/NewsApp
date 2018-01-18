package com.example.arnal.newsapp;

/**
 * Created by arnal on 2/4/17.
 */

public class News {
    private String mTitle;
    private String mUrl;
    private String mSection;
    private String mPublishedDate;


    public News(String title,String section, String publishedDate,String url){
        this.mTitle = title;
        this.mUrl = url;
        this.mSection = section;
        this.mPublishedDate = publishedDate;
    }
    public String getTitle(){return this.mTitle;}

    public String getUrl(){return this.mUrl;}

    public String getSection(){return this.mSection;}

    public String getPublishedDate(){return this.mPublishedDate;}
}

