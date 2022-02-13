package com.rachi.coronovirustracker.models;

public class LocationStats {

    private String state;
    private String Country;
    private int latestTotalCases;
    private int diffFromPreviousDay;
    private int casesInIndia;

    public int getCasesInIndia() {
        return casesInIndia;
    }

    public void setCasesInIndia(int casesInIndia) {
        this.casesInIndia = casesInIndia;
    }

    public int getDiffFromPreviousDay() {
        return diffFromPreviousDay;
    }

    public void setDiffFromPreviousDay(int diffFromPreviousDay) {
        this.diffFromPreviousDay = diffFromPreviousDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}