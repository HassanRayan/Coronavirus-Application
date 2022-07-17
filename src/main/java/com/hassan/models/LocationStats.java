package com.hassan.models;


public class LocationStats {


    private String country;
    private String state;
    private int latestYotalCases;
    private int diffFromPreviousDay;

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getLatestYotalCases() {
        return latestYotalCases;
    }

    public void setLatestYotalCases(int latestYotalCases) {
        this.latestYotalCases = latestYotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", latestYotalCases=" + latestYotalCases +
                '}';
    }
}
