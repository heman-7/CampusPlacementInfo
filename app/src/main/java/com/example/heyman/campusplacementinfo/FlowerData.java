package com.example.heyman.campusplacementinfo;

public class FlowerData {

    private String flowerName;
    private String flowerDescription;
    private int flowerImage;
    private String flowerDetails;
    private StringBuilder flowerReview;

    public FlowerData(String flowerName, String flowerDescription, String details, StringBuilder review, int flowerImage) {
        this.flowerName = flowerName;
        this.flowerDescription = flowerDescription;
        this.flowerDetails=details;
        this.flowerReview=review;
        this.flowerImage = flowerImage;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerDescription() {
        return flowerDescription;
    }

    public String getFlowerDetails()
    {
        return flowerDetails;
    }

    public StringBuilder getFlowerReview()
    {
        return flowerReview;
    }

    public int getFlowerImage() {
        return flowerImage;
    }


}
