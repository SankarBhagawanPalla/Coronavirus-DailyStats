package com.javaworks.coronavirusstats.models;

public class LocationStat {

    private String State;
    private String Country;
    private int latestTotal;

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getLatestTotal() {
        return latestTotal;
    }

    public void setLatestTotal(int latestTotal) {
        this.latestTotal = latestTotal;
    }

    @Override
    public String toString() {
        return "LocationStat{" +
                "State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", latestTotal=" + latestTotal +
                '}';
    }
}
