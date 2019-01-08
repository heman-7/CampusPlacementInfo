package com.example.heyman.campusplacementinfo;
import java.io.Serializable;

public class PlaceInfo implements Serializable {
    private String title;
    private String address;
    private String website;
    private String tag;
    private StringBuilder reviews;

    PlaceInfo()
    {
        title=null;
        address=null;
        website=null;
        tag=null;
        reviews=null;
    }

    PlaceInfo(StringBuilder reviews)
    {
        this.reviews=reviews;
    }

    PlaceInfo(String title, String address, String website, StringBuilder reviews)
    {
        this.title=title;
        this.address=address;
        this.website=website;
        this.reviews=reviews;
    }


    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StringBuilder getReviews() {
        return reviews;
    }

    public void setReviews(StringBuilder reviews) {
        this.reviews = reviews;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
