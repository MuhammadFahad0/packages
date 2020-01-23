package com.fahad.packages;

public class product {
    String Title;
    String Duration;
    String Volume;
    String Activation;
    String Deactivation;
    String Remaining;
    String Info;

    public String getTitle() {
        return Title;
    }

    public String getDuration() {
        return Duration;
    }

    public String getVolume() {
        return Volume;
    }

    public String getActivation() {
        return Activation;
    }

    public String getDeactivation() {
        return Deactivation;
    }

    public String getRemaining() {
        return Remaining;
    }

    public String getInfo() {
        return Info;
    }

    public String getPrice() {
        return Price;
    }

    String Price;

    public product(String title, String duration, String volume, String activation, String deactivation, String remaining, String info, String price) {
        Title = title;
        Duration = duration;
        Volume = volume;
        Activation = activation;
        Deactivation = deactivation;
        Remaining = remaining;
        Info = info;
        Price = price;
    }

}


