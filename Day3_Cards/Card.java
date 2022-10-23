package com.Day3_Cards;

public class Card {
    final private String name;
    final private int likelyhoodToCombust;
    final private int creditScore;
    final private int distanceFromTheNearestGiraffe;
    final private int runningSpeedThroughTreacle;
    final private int timeSpentThinkingAboutTriangles;


    public Card(String name, int likelyhoodToCombust, int creditScore, int distanceFromTheNearestGiraffe, int runningSpeedThroughTreacle, int timeSpentThinkingAboutTriangles) {
        this.name = name;
        this.likelyhoodToCombust = likelyhoodToCombust;
        this.creditScore = creditScore;
        this.distanceFromTheNearestGiraffe = distanceFromTheNearestGiraffe;
        this.runningSpeedThroughTreacle = runningSpeedThroughTreacle;
        this.timeSpentThinkingAboutTriangles = timeSpentThinkingAboutTriangles;
    }

    public int getLikelyhoodToCombust() {
        return likelyhoodToCombust;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getDistanceFromTheNearestGiraffe() {
        return distanceFromTheNearestGiraffe;
    }

    public int getRunningSpeedThroughTreacle() {
        return runningSpeedThroughTreacle;
    }

    public int getTimeSpentThinkingAboutTriangles() {
        return timeSpentThinkingAboutTriangles;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Likelyhood To Combust: " + likelyhoodToCombust +"%"+
                ", Credit Score: " + creditScore +
                ", Distance From The Nearest Giraffe: " + distanceFromTheNearestGiraffe +"m"+
                ", Running Speed Through Treacle: " + runningSpeedThroughTreacle +"m/s"+
                ", Time Spent Thinking About Triangles: " + timeSpentThinkingAboutTriangles +"hrs";
    }
}
